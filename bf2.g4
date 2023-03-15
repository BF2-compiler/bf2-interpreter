grammar bf2;

prog
    : funcDef expression
    | expression
    ;

funcDef
    : func nameOperator VARNAME lbrace expression rbrace
    | funcDef funcDef
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
    | directionalMove getOperator
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
    : LEFT
    | RIGHT
    | UP
    | DOWN
    | LOWERBOARD
    | UPPERBOARD
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

LEFT
    : '<'
    ;
 
RIGHT
    : '>'
    ;

UP
    : '^'
    ;

DOWN
    : 'v'
    ;

LOWERBOARD
    : '['
    ;

UPPERBOARD
    : ']'
    ;

VARNAME
    : [a-zA-Z]+
    ;

NUMBER
    : [1-9][0-9]*
    ;
