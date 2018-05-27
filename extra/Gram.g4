grammar Gram;

// Parser Rules
program: (statement)+ ;
statement: ifStmt | initListStmt | initElemStmt | initValStmt | mathStmt | onVarStmt | printStmt | saveDocStmt | whileStmt;
ifStmt: IF STARTNBRACKET expression ENDNBRACKET STARTCBRACKET (statement)+ ENDCBRACKET ( elseFun )? ;
elseFun: ELSE STARTCBRACKET (statement)+ ENDCBRACKET;
whileStmt: WHILE STARTNBRACKET expression ENDNBRACKET STARTCBRACKET (statement)+ ENDCBRACKET ;
mathStmt: VARNAME ASSIGNOP ((numberArgument MATHOP numberArgument) | argument) SEMICOLON ;
saveDocStmt: SAVE STARTNBRACKET VARNAME COMMA textArgument ENDNBRACKET SEMICOLON ;
printStmt: PRINT STARTNBRACKET textArgument ENDNBRACKET SEMICOLON ;
initListStmt: LISTVAR VARNAME ASSIGNOP ( initListFun | VARNAME ) ( ( modListFun )+ | ( filterFun )+ )? SEMICOLON ;
onVarStmt: VARNAME (STARTSBRACKET numberArgument ENDSBRACKET)? onVarFun SEMICOLON ;
onVarFun: ( modListFun )+ | ( filterFun )+ | ( modAttrFun )+ | sizeFun ;
initListFun: createFun | readFun ;
createFun: CREATE STARTNBRACKET ( VARNAME )? ENDNBRACKET ;
readFun: READ STARTNBRACKET textArgument ENDNBRACKET ;
filterFun: filterAttrFun | filterTagFun ;
filterAttrFun: EXOP FILTERBYATTR STARTNBRACKET textArgument COMMA argument ENDNBRACKET ;
filterTagFun: EXOP FILTERBYTAG STARTNBRACKET textArgument ENDNBRACKET ;
modListFun: EXOP MODLISTOP STARTNBRACKET VARNAME ENDNBRACKET ;
sizeFun : EXOP SIZE STARTNBRACKET ENDNBRACKET;
initElemStmt: ELEMVAR VARNAME ASSIGNOP  initElemFun ( setAttrFun )? SEMICOLON ;
initElemFun: createElemFun | getElemFun ;
createElemFun: CREATE STARTNBRACKET textArgument ENDNBRACKET ;
getElemFun: VARNAME STARTSBRACKET numberArgument ENDSBRACKET ;
modAttrFun: setAttrFun | deleteAttrFun ;
setAttrFun: EXOP SETATTR STARTNBRACKET textArgument COMMA argument ENDNBRACKET ;
deleteAttrFun: EXOP DELETEATTR STARTNBRACKET textArgument ENDNBRACKET ;
initValStmt :
    ( NUMBERVAR | STRINGVAR) VARNAME ASSIGNOP (
         argument
        | ( numberArgument MATHOP numberArgument )
        | VARNAME sizeFun
    ) SEMICOLON
    	;
expression: numberArgument EXPRESSIONOP numberArgument ( ANDOP numberArgument EXPRESSIONOP numberArgument )* ;
textArgument: VARNAME | TEXT ;
numberArgument: VARNAME | NUMBER ;
argument: VARNAME | TEXT | NUMBER ;

// Lexer Rules
IF: 'if';
ELSE: 'else';
WHILE: 'while';
STARTCBRACKET: '{';
ENDCBRACKET: '}';
STARTNBRACKET: '(';
ENDNBRACKET: ')';
STARTSBRACKET: '[';
ENDSBRACKET: ']';
ASSIGNOP: '=';
EXPRESSIONOP: '<' | '>' | '<=' | '>=' | '==' | '!=';
MATHOP: '+' | '-' | '*' | '/' ;
ANDOP: '&&' | '||';
MODLISTOP: 'add' | 'remove' ;
EXOP: '.';
COMMA: ',';
SEMICOLON: ';';
GETATTR: 'getAttr';
SETATTR: 'setAttr';
DELETEATTR: 'deleteAttr';
SAVE: 'save';
READ: 'read';
PRINT: 'print';
CREATE: 'create';
SIZE: 'size';
FILTERBYATTR: 'filterByAttr';
FILTERBYTAG: 'filterByTag';
NUMBERVAR: 'num';
STRINGVAR: 'string';
LISTVAR: 'list';
ELEMVAR: 'elem' ;
NUMBER: ('0'|'-'?[1-9][0-9]*);
VARNAME: [a-zA-Z]([a-zA-Z]|NUMBER)*;
TEXT: '"'.+?'"' ;

WHITESPACE :  (' ' | '\t' | '\r' | '\n') {skip();};