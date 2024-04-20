// DELETE THIS CONTENT IF YOU PUT COMBINED GRAMMAR IN Parser TAB
grammar Soct;


WS: [ \t\n\r\f]+ -> skip ;
RUN: 'run' ;
BIND : 'bind' ;
COMPOSITION : '|' ;
SEND : '!' ;
REPLICATED_RECEIVE : '?*' ;
RECEIVE : '?' ;
COMMA : ',' ;
LPAREN : '(' ;
RPAREN : ')' ;
LBRACKET : '[' ;
RBRACKET : ']' ;
CHANNEL: [a-zA-Z_][a-zA-Z_0-9]* ;


program
    : expressions EOF
    ;

expressions
    : statement
    | expressions statement
    ;

statement
    : RUN expression
    ;

expression: LPAREN agent RPAREN;

inaction
    : LPAREN RPAREN
    ;

soloObjects
    : channelList
    | CHANNEL
    ;

solo
    : CHANNEL (SEND | RECEIVE | REPLICATED_RECEIVE) soloObjects
    ;

agent
    : inaction
    | solo
    | agent COMPOSITION agent
    | BIND channelList expression
    ;

innerList
    : CHANNEL
    | innerList COMMA CHANNEL
    ;

channelList
    : LBRACKET innerList RBRACKET
    ;