grammar bf^2;

prog
    : funcDef expression
    | expression
    ;

funcDef
    : funcDef funcDef
    ;

funcDef
    : func nameOperator VARNAME lbrace expression rbrace
    ;
    
func
    : 'func'
    ;
    
expression
    : expression expression
    | loop
    | ifStatement
    | boolStatement
    | assign
    | directionalMove
    ;
    
loop
    : do lbrace expression rbrace number
    | do lbrace expression rbrace if lparenthesis boolStatement rparenthesis
    ;
    
do
    : 'do'
    ;
    
ifStatement
    : if lparenthesis boolStatement rparenthesis lbrace expression rbrace
    ;
    
if
    : 'if'
    ;

boolStatement
    : varGetter comparisonOperator varGetter
    | varGetter
    | boolStatement logicalOperator boolStatement
    | lparenthesis boolStatement rparenthesis
    ;
    

assign
    : assignOperator expression getOperator
    ;
    
varGetter
    : number
    | expression getOperator
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
    : left
    | right
    | up
    | down
    | lowerBoard
    | upperBoard
    | directionalMove directionalMove
    ;

nameOperator
    : ':'
    ;

getOperator
    : '.'
    ;

assignOperator
    : '='
    ;

number
    : NUMBER
    ;

lbrace
    : '{'
    ;
    
rbrace
    : '}'
    ;
    
lparenthesis
    : '('
    ;
    
rparenthesis
    : ')'
    ;

left
    : '<'
    ;
 
right
    : '>'
    ;

up
    : '^'
    ;

down
    : 'v'
    ;

lowerBoard
    : '['
    ;

upperBoard
    : ']'
    ;

VARNAME
    : [a-zA-Z]+
    ;

NUMBER
    : [1-9][0-9]*
    ;
