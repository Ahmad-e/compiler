parser grammar MyLanguageParser;

options { tokenVocab= MyLanguageLexer; }


program: lunchingProgram;
lunchingProgram: classHeader;

classHeader: Const ARRAY_STRING_VALUES  Equal LParen RParen  Equal Gt LBrack ( useState | function | classReturnBody)* RBrack EXP ARRAY_STRING_VALUES  #classHeaders ;
classReturnBody: Return LParen mainTags RParen SEIMIE_QO*  #classBodys;

useState : Const LBig ARRAY_STRING_VALUES COMMA ARRAY_STRING_VALUES RBig Equal Use_State LParen RParen SEIMIE_QO* #use_state ;

function : Function ARRAY_STRING_VALUES LParen RParen LBrack classReturnBody* RBrack ;



mainTags:  Lt Div Gt tag Lt Slash Div Gt ;
tag : ( div | h1 | img | p )*  ;
div: Lt Div props Gt (tag | ARRAY_STRING_VALUES* |ARRAY_NUMERIC_VALUES* ) Lt Slash Div Gt;
h1: Lt H1 props Gt (tag | ARRAY_STRING_VALUES* |ARRAY_NUMERIC_VALUES* ) Lt Slash H1 Gt ;
p: Lt P props Gt (tag | ARRAY_STRING_VALUES* |ARRAY_NUMERIC_VALUES* ) Lt Slash P Gt ;
img: Lt Img src props  Slash Gt ;

props : ( width | height | onClick )* ;
width : Width Equal ARRAY_NUMERIC_VALUES ( Pixl | Rate ) ;
height : Height Equal ARRAY_NUMERIC_VALUES ( Pixl | Rate ) ;
src : Src Equal  DQuote ARRAY_STRING_VALUES DQuote  ;
onClick : OnClick Equal LBrack ARRAY_STRING_VALUES LParen ARRAY_STRING_VALUES* RParen RBrack  ;






//headerFunction:  Const ARRAY_STRING_VALUES  Equal LParen ARRAY_STRING_VALUES* RParen Equal Gt LBrack  RBrack ;

//commponent : NEW_Commponent   ;

//function : New_Function (product | return | useState )* CLOSE_Function  ;

//product : Product Close_Product ;

//return : Return  tags  Close_Return ;

//start_function : Start_Function ;

//page : NEW_PAGE page_style+ CLOSE_PAGE;
//
//page_style: (name|nav|footer) SEIMIE_QO;

// : Use_State;
//
//
//name: NAME OPEN_BRACKET QOUT page_name? QOUT CLOSE_BRACKET;
//
//page_name: STRING;
//
//nav:NAV;
//
//footer:FOOTER;

/*function :  FUNCTION OPEN_BRACKET CLOSE_BRACKET  SEMICOLEN SPACE;
options { tokenVocab= MyLanguageLexer; }
*/