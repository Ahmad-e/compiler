lexer grammar MyLanguageLexer;

Const : 'const' ' '*;

Function:  ('Function' | 'function') ' '* ;
//Use_State_word : ' '* 'useState' ' '* ;
EXP : 'export default' ' '* ;
Use_State: 'useState' ;
//New_Function : 'const' ' '* ARRAY_STRING_VALUES '='  '(' ARRAY_STRING_VALUES*  ')'  '=>'  '{' ->pushMode(Open_Function);
//mode Open_Function;
//CLOSE_Function : ' '* '}' ' '* 'export default ' ARRAY_STRING_VALUES  ->popMode;
//Use_State : Const ' '* '[' ARRAY_STRING_VALUES ',' ARRAY_STRING_VALUES ']' ' '* '=' ' '* 'useState' ' '*   '('  ')';
//Product : ' '* 'product' '=' ' '* '{'  ->pushMode(Open_Product) ;
//Return : 'return' '('  ->pushMode(Close_R) ;
//
//mode Close_R;
//Close_Return : (ARRAY_STRING_VALUES | ARRAY_NUMERIC_VALUES) ' '* ')' ' '* ->popMode;
//

Return: 'return';

Div : 'div' ;
H1 : 'h1' ;
Img : 'img' ;
P : 'p';

Width: ' '* 'width';
Height : ' '* 'height';
Pixl:'px';
Rate : '%';
Src: ' '* 'src';
OnClick : ' '* ( 'onClick' | 'onclick' );

//mode Open_Product;
//Close_Product : '}' ' '* ->popMode;



//Name : ' '* 'name' ' '* ':' ;
//Img_URL : ' '* 'image' ' '* ':' ;
//Disc : ' '* 'dicscription' ' '* ':';

//NEW_Commponent :  Const ARRAY_STRING_VALUES  '='  '(' ARRAY_STRING_VALUES  ')'  '=>'  '{'   ;
//LOSE_Commponent : '}'  ;
//Use_State : Const '[' ARRAY_STRING_VALUES ',' ARRAY_STRING_VALUES ']' ' '* '=' Use_State_word  '()' Semi ;
//RETURN : ' '* 'return' ' '* '(' ' '* ')';

/*
NEW_PAGE : ' '* 'hi' ' '* '{' ' '* ->pushMode(PAGE);

mode PAGE;
CLOSE_PAGE : ' '* '}' ' '* ->popMode;
NAME : ' '* 'name' ' '*;
NAV : ' '* 'add nav' ' '*;
FOOTER : ' '* 'add footer' ' '*;
OPEN_BRACKET : ' '* '(' ' '* ->pushMode(ATTRIBUTES);
SEIMIE_QO : ' '* ';' ' '*;

mode ATTRIBUTES;
CLOSE_BRACKET:' '*')'' '*->popMode;
QOUT: ' '* '\'' ' '*;
STRING: ('a'..'z' ' '*)+;

*/
SEIMIE_QO : ';';
Space : ' ' ;
Equal : '=' ;
DIGITS : '0' .. '9' ;
Esc : '\\' ;
Slash:'/';
Colon : ':' ;
DColon : '::' ;
DQuote : '"' ;
LParen : '(' ;
RParen : ')' ;
LBrack : '{' ;
RBrack : '}' ;
LBig : '[' ;
RBig : ']' ;
RArrow : '->' ;
Lt : '<' ;
Gt : '>' ;
EE: '==';
NE: '!=';
NOT: '!';
Question : '?' ;
Star : '*' ;
Plus : '+' ;
PlusAssign : '+=' ;
Underscore : '_' ;
Pipe : '|' ;
COMMA: ',';
Dot : '.' ;

LETTER : ('a' .. 'z' | 'A' .. 'Z') ;

ARRAY_STRING_VALUES: [a-zA-Z]+ [0-9]*  |  LETTER  ;
ARRAY_NUMERIC_VALUES: [0-9]+;
/*
fragment NEWLINE : '\n' | '\r' | '\r\n' ;
fragment StringDQ : '"' StringContentDQ*? '"' ;
fragment StringContentDQ : ~('\\' | '"' | '\n' | '\r' | '$') | '\\' ~('\n' | '\r') | StringDQ | '${' StringContentDQ*? '}' | '$' { CheckNotOpenBrace() }? ;
fragment StringSQ : '\'' StringContentSQ*? '\'' ;
fragment StringContentSQ : ~('\\' | '\'' | '\n' | '\r' | '$') | '\\' ~('\n' | '\r') | StringSQ | '${' StringContentSQ*? '}' | '$' { CheckNotOpenBrace() }? ;
fragment StringContentTDQ : ~('\\' | '"') | '"' ~'"' | '""' ~'"' ;
fragment StringContentTSQ : '\'' ~'\'' | '\'\'' ~'\'' | . ;
fragment DIGIT : '0' .. '9' ;
fragment EXPONENT : ( 'e' | 'E' ) ( '+' | '-' )? DIGIT+ ;
*/