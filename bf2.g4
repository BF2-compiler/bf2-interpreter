grammar bf2;

prog
    : (line EOL)+ line? EOF
    ;
    
line
    : command + comment?
    | comment
    | funcDef
    ;

command
    : loop
    | ifStatement
    | funcCall
    | directionalMove
    | expression
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
    : '=' block
    ;
    
varGetter
    : NUMBER
    | command+ '.'
    ;

expression
    : multiplyingExpression (('+' | '-') multiplyingExpression)*
    ;

multiplyingExpression
   : signExpression (('*' | '/') signExpression)*
   ;

signExpression
   : (('+' | '-'))* (NUMBER | varGetter)
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
    | '\'
    | '/'
    ;

VARNAME
    : [a-zA-Z]+
    ;

NUMBER
    : [1-9][0-9]*
    ;
    
EOL
    : '\r'? '\n'
    ;
