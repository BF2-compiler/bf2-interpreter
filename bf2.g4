grammar bf2;

prog
    : (line EOL)+ line? EOF
    ;
    
line
    : command + COMMENT?
    | COMMENT
    | funcDef
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
    : 'do' block '(' NUMBER ')'
    | 'do' block 'if' '(' boolStatement ')'
    ;

block
    : '{' command+ '}'
    ;

ifStatement
    : 'if' '(' boolStatement ')' block
    ;

boolStatement
    : varGetter comparisonOperator varGetter
    | varGetter
    | boolStatement logicalOperator boolStatement
    | '(' boolStatement ')'
    ;
    
assign
    : '=' varGetter
    | '=' NUMBER
    ;
    
varGetter
    : NUMBER
    | block '.'
    ;

expression
    : multiplyingExpression (('+' | '-') multiplyingExpression)*
    ;

multiplyingExpression
   : signExpression (('*' | '/') signExpression)*
   ;

signExpression
   : (('+' | '-'))* varGetter
   ;
    
logicalOperator
    : '&&'
    | '||'
    ;

comparisonOperator
    : '<?'
    | '>?'
    | '<=?'
    | '>=?'
    | '=?'
    | '!=?'
    ;
    
directionalMove
    : '<'
    | '>'
    | '^'
    | 'v'
    | '\\'
    | '/'
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
