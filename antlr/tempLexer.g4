lexer grammar tempLexer;

BEGIN: 'begin' ;
END: 'end' ;
SKIP: 'skip' ;
EXIT: 'exit' ;
PRINT: 'print' ;
PRINTLN: 'println' ;
FREE: 'free' ;
RETURN: 'return' ;
//pair
PAIR: 'pair' ;
NEWPAIR: 'newpair' ;
FST: 'fst' ;
SND: 'snd' ;
//if
IF: 'if' ;
THEN: 'then' ;
ELSE: 'else' ;
FI: 'fi' ;
//while
WHILE: 'while' ;
DO: 'do' ;
DONE: 'done' ;

WS: [ \n\t]+ -> skip ;
fragment HASH: '#' ;
COMMENTS: HASH ~[\n]* '\n' -> skip ;

fragment DIGIT: [0-9] ;
fragment SIGN: '-' | '+' ;
INT_LIT: SIGN? DIGIT+ ;

fragment FALSE: 'false' ;
fragment TRUE: 'true' ;
BOOL_LIT: TRUE | FALSE ;

fragment ESC_CHAR: '0' | 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\'' | '\\' ;
fragment CHARACTER: ~[\\\-\"] | '\\' ESC_CHAR ;
CHAR_LIT: '\'' CHARACTER '\'' ;
STRING_LIT: '"' CHARACTER* '"' ;

fragment NULL: 'null' ;
PAIR_LIT: NULL ;

fragment ALPHABET: [A-z] ;
IDENT: ( '_' | ALPHABET ) ( '_' | ALPHABET | DIGIT )* ;

UNARY_OP: '!' | '-' | 'len' | 'ord' | 'chr' ;
BINARY_OP: '*' | '/' | '%' | '+' | '-' 
         | '>' | '>=' | '<' | '<=' 
         | '==' | '!=' | '&&' | '||'
         ;

//punctuation
SEMICOLON: ';' ;
OPEN_PAR: '(' ;
CLOSE_PAR: ')' ;
OPEN_SQ_BRACK: '[' ;
CLOSE_SQ_BRACK: ']' ;
COMMA: ',' ;

//base types
INT: 'int' ;
CHAR: 'char' ;
STRING: 'string' ;
BOOLEAN : 'bool' ;
BASE_TYPE: INT | CHAR | STRING | BOOLEAN ;