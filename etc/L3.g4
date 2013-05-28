/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

grammar L3;

prog: finalstatment* EOF;

LC: '{';
RC: '}';
DEF : 'def';
LA : '(';
RA : ')';
IF: 'if';
ELSE: 'else';
WHILE: 'while';
DO: 'do';
RETURN : 'return';
SEMI: ';';
BREAK: 'break';
CONTINUE: 'continue';
TRUE : 'true';
FALSE: 'false';
COMA: ',';
LB: '[';
RB: ']';
MUL: '*';
DIV: '/';
MOD: '%';
ADD: '+';
SUB: '-';
LT : '<';
GT : '>';
LET : '<=';
GET : '>=';
AND : '&&';
EQ : '==';
NEQ : '!=';
OR : '||';
QM : '?';
CL : ':';
ASSIGN: '=';

finalstatment:statement             #statementLabel
             |functionDef           #functionDefLabel
             ;

functionDef: 'def' Identifier '(' formalParameterDecls? ')' block;
formalParameterDecls: Identifier (',' Identifier)*     #functionParameterDefLabel
                    ;

block: '{' statement* '}';      
     
statement: block                #blockLabel
         | 'if' parExpression statement ('else' statement)? #ifLabel
         | 'while' parExpression statement  #whileLabel
         | 'do' statement 'while' parExpression ';' #doLabel
         | 'return' expression? ';' #returnLabel
         | 'break' ';'  #breakLabel
         | 'continue' ';'   #continueLabel
         | statementExpression ';' #statementExpressionLabel
         | ';'  #semiLabel
         ;

parExpression: '(' expression ')'  #parExpressoinLabel ;
statementExpression : expression;

expression:
       primary                                          #primaryLabel
       | expression '[' expression ']'                  #indexVisitLabel
       | expression '(' expressionList? ')'             #callFunctionLabel
       | expression op=('*'|'/'|'%') expression         #mulDivModLabel
       | expression op=('+'|'-') expression             #addSubLabel
       | expression op=('<=' | '>=' | '>' | '<') expression #conditionLabel
       | expression op=('==' | '!=') expression         #isEqualLabel
       | expression '&&' expression         #andLabel
       | expression '||' expression         #orLabel
       | expression '?' expression ':' expression #fastConditionLabel
       | expression '='<assoc=right> expression  #assignLabel
       ;

expressionList : expression (',' expression)*  #expressionListLabel;

primary: '(' expression ')'     #brackerExpressionLabel
         | literal              #literalLabel
         | Identifier           #identifierLabel
         ;

literal : INTEGER           #integerLabel
        | FLOAT             #floatLabel
        | 'true'            #trueLabel
        | 'false'           #falseLabel
        | STRING            #stringLabel
        ;

Identifier: LETTER ( LETTER | DIGIT )* ;


WS  :  [ \r\t\n\r]+ -> channel(HIDDEN);
STRING: '"' (ESC | .)*? '"';
LETTER: [a-z|A-Z|_];
INTEGER : DIGIT+;
FLOAT : DIGIT+ '.' DIGIT+;
       
COMMENT:   '/*' .*? '*/' -> channel(HIDDEN);

LINE_COMMENT : '//' ~[\r\n]* ('\r'? '\n' | EOF) -> channel(HIDDEN);

fragment ESC : '\\' [btnr"\\] ;
fragment DIGIT: [0-9];
