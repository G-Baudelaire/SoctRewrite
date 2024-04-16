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
    : RUN expression
    | expressions RUN expression
    ;

expression: LPAREN agent RPAREN;

inaction
    : LPAREN RPAREN
    ;

solo_objects
    : channel_list
    | CHANNEL
    ;

solo
    : CHANNEL (SEND | RECEIVE | REPLICATED_RECEIVE) solo_objects
    ;

agent
    : inaction
    | solo
    | agent COMPOSITION agent
    | BIND channel_list expression
    ;

inner_list
    : CHANNEL
    | inner_list COMMA CHANNEL
    ;

channel_list
    : LBRACKET inner_list RBRACKET
    ;