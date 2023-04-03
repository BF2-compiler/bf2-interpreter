grammar bf2;

prog
    : (line EOL)+ line? EOF    # Program
    ;
    
line
    : command + COMMENT?        # CommandPlusComment
    | COMMENT                   # Comment
    | funcDef                   # DefinitionOfFunction
    | command + print           # CommandAndPrint
    ;

command
    : loop
    | ifStatement
    | funcCall
    | directionalMove
    | expression
    | assign
    ;

funcDef
    : 'func' ':' VARNAME EOL? '{' (line? EOL)+ '}'
    ;
    
funcCall
    : VARNAME
    ;
    
loop
    : 'do' block '(' NUMBER ')'                 # DoLoop
    | 'do' block 'if' '(' boolStatement ')'     # ConditionalLoop
    ;

block
    : '{' command+ '}'
    ;

ifStatement
    : 'if' '(' boolStatement ')' block
    ;

boolStatement
    : varGetter comparisonOperator varGetter        # VariableOperatorVariable
    | varGetter                                     # VariableBool
    | boolStatement logicalOperator boolStatement   # BoolOperatorBool
    | '(' boolStatement ')'                         # ParenthesisBool
    ;
    
assign
    : '=' varGetter     # AssignVariable
    | '=' NUMBER        # AssignNumber //TO DELETE
    ;
    
varGetter
    : NUMBER        # NumberGet
    | block '.'     # BlockGet
    | '.'           # Get
    ;

expression
    : expression '+' expression     # Addition
    | expression '-' expression     # Substraction
    | expression '*' expression     # Multiplication
    | expression '/' expression     # Division
    | '(' expression ')'            # ParenthesisExpression
    | varGetter                     # VariableExpression
    ;

print
    : '@'
    ;

    
logicalOperator
    : '&&'          # LogicalAnd
    | '||'          # LogicalOr
    ;

comparisonOperator
    : '<?'          # ComparisonLess
    | '>?'          # ComparisonGreater
    | '<=?'         # ComparisonLessEqual
    | '>=?'         # ComparisonGreaterEqual
    | '=?'          # ComparisonEqual
    | '!=?'         # ComparisonNotEqual
    ;
    
directionalMove
    : '<'           # MoveLeft
    | '>'           # MoveRight
    | '^'           # MoveUp
    | 'v'           # MoveDown
    | '\\'          # LowerBoard
    | '//'          # UpperBoard
    ;

VARNAME
    : [a-zA-Z]+
    ;

NUMBER
    : [1-9][0-9]*
    ;
    
COMMENT
    : '%' ~ [\r\n]*
    ;
    
EOL
    : '\r'? '\n'
    ;

WS
   : [ \t\r\n] -> skip
   ;
