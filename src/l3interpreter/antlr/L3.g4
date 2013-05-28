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

finalstatment:statement
             |functionDef
             ;

functionDef: 'def' Identifier '(' formalParameterDecls? ')' block;
formalParameterDecls: Identifier (',' Identifier)* ;

block: '{' statement* '}';
     
statement: block
         | 'if' parExpression statement ('else' statement)?
         | 'while' parExpression statement
         | 'do' statement 'while' parExpression ';'
         | 'return' expression? ';'
         | 'break' ';'
         | 'continue' ';'
         | statementExpression ';'
         | ';'
         ;

parExpression: '(' expression ')';
statementExpression : expression;

expression:
       primary
       | expression '[' expression ']'
       | expression '(' expressionList? ')'
       | expression op=('*'|'/'|'%') expression
       | expression op=('+'|'-') expression
       | expression op=('<=' | '>=' | '>' | '<') expression
       | expression op=('==' | '!=') expression
       | expression '&&' expression
       | expression '||' expression
       | expression '?' expression ':' expression
       | expression '='<assoc=right> expression
       ;

expressionList : expression (',' expression)*;

primary: '(' expression ')'
         | literal
         | Identifier
         ;

literal : NUMBER
        | 'true'
        | 'false'
        | STRING
        ;

Identifier: LETTER ( LETTER | DIGIT )*;


WS  :  [ \r\t\n\r]+ -> channel(HIDDEN);
STRING: '"' (ESC | .)*? '"';
LETTER: [a-z|A-Z|_];
NUMBER : DIGIT+ '.' DIGIT+
       | DIGIT+
       ;
COMMENT:   '/*' .*? '*/' -> channel(HIDDEN);

LINE_COMMENT : '//' ~[\r\n]* ('\r'? '\n' | EOF) -> channel(HIDDEN);

fragment ESC : '\\' [btnr"\\] ;
fragment DIGIT: [0-9];
