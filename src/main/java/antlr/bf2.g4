grammar bf2;

prog
    : NUMBER ',' NUMBER EOL+ (line EOL+)+ line? EOF    # Program
    ;
    
line
    : command+ COMMENT?         # CommandComment
    | COMMENT                   # Comment
    | funcDef                   # DefinitionOfFunction
    ;

command
    : loop                      # CommandLoop
    | ifStatement               # CommandIfStatement
    | funcCall                  # CommandFuncCall
    | directionalMove           # CommandDirectionalMove
    | expression                # CommandExpression
    | assign                    # CommandAssign
    ;

funcDef
    : 'func' ':' VARNAME EOL? funcBlock
    ;
    
funcCall
    : VARNAME
    ;

funcBlock
    : '{' command+ '}'
    ;
    
loop
    : 'do' block '(' NUMBER ')'                 # DoLoop
    | 'do' block 'if' '(' boolStatement ')'     # ConditionalLoop
    ;

block
    : '{' command+ '}'
    ;

ifStatement
    : 'if' '(' boolStatement ')' EOL* block EOL* ('elif' '(' boolStatement ')' EOL* block)* EOL* ('else' EOL* block)?
    ;

boolStatement
    : varGetter comparisonOperator varGetter        # VariableOperatorVariable
    | varGetter                                     # VariableBool
    | boolStatement logicalOperator boolStatement   # BoolOperatorBool
    | '(' boolStatement ')'                         # ParenthesisBool
    ;
    
assign
    : '=' varGetter
    ;
    
varGetter
    : NUMBER        # NumberGet
    | block '.'     # BlockGet
    | '.'           # Get
    ;

expression
    : '(' expression ')'            # ParenthesisExpression
    | expression '*' expression     # Multiplication
    | expression '/' expression     # Division
    | expression '+' expression     # Addition
    | expression '-' expression     # Substraction
    | varGetter                     # VariableExpression
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
    : [A-Z_]+
    ;

NUMBER
    : '0'|[1-9][0-9]*
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