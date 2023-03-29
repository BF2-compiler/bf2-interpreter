import sys
from antlr4 import FileStream, CommonTokenStream
from antlr4.error.ErrorListener import ErrorListener, ConsoleErrorListener
from EpicLangLexer import EpicLangLexer
from EpicLangParser import EpicLangParser
from EpicLangVisitor import EpicLangVisitor

class BreakException(Exception):
    pass

class ContinueException(Exception):
    pass

class ReturnException(Exception):
    pass

# handler for syntax errors
class ErrorHandler(ErrorListener):
    def syntaxError(self, *args):
        print('syntax error')
        sys.exit(0)

class FunctionVisitor(EpicLangVisitor):
    def __init__(self):
        self.vars = {}
        self.funcs = {}

    def visitFunctionDecl(self, ctx):
        name = ctx.name.text
        if name in self.funcs:
            print('runtime error')
            exit(0)
        params = ctx.identifier() if hasattr(ctx, 'identifier') else []
        params = [self.visit(x) for x in params]
        self.funcs[name] = (params, ctx.block())

    def visitIdentifier(self, ctx):
        return ctx.var.text

class GoatVisitor(EpicLangVisitor):
    def __init__(self, variables=None, funcs=None):
        self.variables = variables or {}
        self.funcs = funcs or {}
        self.retval = None

    def visitBlock(self, ctx):
        for stmt in ctx.stmt():
            self.visit(stmt)

    def visitPrintStmt(self, ctx):
        print(self.visit(ctx.expr()))

    def visitBinExpr(self, ctx):
        left = self.visit(ctx.expr()[0])
        right = self.visit(ctx.expr()[1])
        if type(left) != type(right):
            print('runtime error')
            exit(0)
        op = {
            '+': lambda a, b: a + b,
            '-': lambda a, b: a - b,
            '*': lambda a, b: a * b,
            '/': lambda a, b: a // b,
            '%': lambda a, b: a % b,
            '&' : lambda a, b: a & b,
            '|' : lambda a, b: a | b,
            '<' : lambda a, b: a < b,
            '<=' : lambda a, b: a <= b,
            '>' : lambda a, b: a > b,
            '>=' : lambda a, b: a >= b,
            '==' : lambda a, b: a == b,
            '!=' : lambda a, b: a != b
        }
        try:
            return op[ctx.op.text](left, right)
        except (TypeError, ValueError, ZeroDivisionError):
            print('runtime error')
            exit(0)

    def visitUnaryExpr(self, ctx):
        op = {
            '+' : lambda x: x,
            '-' : lambda x: -x,
            '!' : lambda x: not x,
            'len' : len
        }
        try:
            return op[ctx.op.text](self.visit(ctx.expr()))
        except (TypeError, ValueError, ZeroDivisionError):
            print('runtime error')
            exit(0)

    def visitParenExpr(self, ctx):
        return self.visit(ctx.expr())

    def visitNumExpr(self, ctx):
        return int(ctx.num.text)

    def visitTrueLiteral(self, ctx):
        return True

    def visitFalseLiteral(self, ctx):
        return False

    def visitIfStmt(self, ctx):
        cond = self.visit(ctx.expr())
        if not isinstance(cond, bool):
            print('runtime error')
            exit(0)
        if cond:
            self.visit(ctx.stmt())

    def visitIfElseStmt(self, ctx):
        cond = self.visit(ctx.expr())
        if not isinstance(cond, bool):
            print('runtime error')
            exit(0)
        if cond:
            self.visit(ctx.stmt()[0])
        else:
            self.visit(ctx.stmt()[1])

    def visitWhileStmt(self, ctx):
        while True:
            cond = self.visit(ctx.expr())
            if not isinstance(cond, bool):
                print('runtime error')
                exit(0)
            if not cond:
                break
            try:
                self.visit(ctx.stmt())
            except BreakException:
                break
            except ContinueException:
                continue

    def visitBreakStmt(self, ctx):
        raise BreakException()

    def visitContinueStmt(self, ctx):
        raise ContinueException()

    def visitNoneObj(self, ctx):
        return None

    def visitFuncCall(self, ctx):
        fname = ctx.name.text
        if fname not in self.funcs:
            print('runtime error')
            exit(0)
        (formal_parameters, function_body) = self.funcs[fname]
        actual_parameters = []
        if ctx.expr():
            actual_parameters = [self.visit(param) for param in ctx.expr()]

        if len(actual_parameters) != len(formal_parameters):
            print('runtime error')
            exit(0)
        stack_frame = dict(zip(formal_parameters, actual_parameters))
        visitor = GoatVisitor(stack_frame, self.funcs)
        try:
            visitor.visit(function_body)
        except BreakException:
            print('runtime error')
            exit(0)
        except ContinueException:
            print('runtime error')
            exit(0)
        except ReturnException:
            pass
        return visitor.retval

    def visitReturnStmt(self, ctx):
        x = ctx.expr()
        if x:
            self.retval = self.visit(x)
        raise ReturnException

    def visitForStmt(self, ctx):
        var = ctx.var.text
        lbound = self.visit(ctx.lbound)
        ubound = self.visit(ctx.ubound)
        if (not isinstance(lbound, int)) or (not isinstance(ubound, int)):
            print("runtime error")
            exit(0)
        need_restore = False
        if var in self.variables:
            need_restore = True
            restore_val = self.variables[var]
        for i in range(lbound, ubound):
            self.variables[var] = i
            try:
                self.visit(ctx.stmt())
            except BreakException:
                break
            except ContinueException:
                continue
        if need_restore:
            self.variables[var] = restore_val

    def visitListExpr(self, ctx):
        return [self.visit(x) for x in ctx.expr()] if ctx.expr() else []

    def visitIndexExpr(self, ctx):
        base = self.visit(ctx.expr()[0])
        idx = self.visit(ctx.expr()[1])
        try:
            return base[idx]
        except (TypeError, ValueError, IndexError):
            print("runtime error")
            exit(0)

    def visitVarExpr(self, ctx):
        var = ctx.var.text
        try:
            return self.variables[var]
        except KeyError:
            print("runtime error")
            exit(0)

    def visitAssignStmt(self, ctx):
        var = ctx.var.text
        self.variables[var] = self.visit(ctx.rhs)

    def visitAssignIdxStmt(self, ctx):
        base = self.visit(ctx.expr()[0])
        idx = self.visit(ctx.expr()[1])
        rhs = self.visit(ctx.expr()[2])
        try:
            base[idx] = rhs
        except (TypeError, ValueError, IndexError):
            print("runtime error")
            exit(0)

def main():
    # create input stream
    in_stream = FileStream(sys.argv[1])

    # create a lexer
    lexer = EpicLangLexer(in_stream)
    # add error handling for our lexer
    lexer.addErrorListener(ErrorHandler())
    lexer.removeErrorListener(ConsoleErrorListener.INSTANCE)

    # create a parser with the lexer as an input
    stream = CommonTokenStream(lexer)
    parser = EpicLangParser(stream)
    # add error handling for our parser
    parser.addErrorListener(ErrorHandler())
    parser.removeErrorListener(ConsoleErrorListener.INSTANCE)

    # use the parser to obtain an abstract syntax tree
    tree = parser.program()

    visitor = FunctionVisitor()
    visitor.visit(tree)
    if ('main' not in visitor.funcs) or (visitor.funcs['main'][0]):
        print("runtime error")
        exit(0)
    visitor2 = GoatVisitor({}, visitor.funcs)
    try:
        visitor2.visit(visitor.funcs['main'][1])
    except BreakException:
        print("runtime error")
        exit(0)
    except ContinueException:
        print("runtime error")

if __name__ == "__main__":
    main()