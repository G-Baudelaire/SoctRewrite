grammar Soct;

WHITESPACE: [ \t\n\r\f]+ -> skip ;
PRINT: 'print' ;
MATCH: 'match' ;
RUN: 'run' ;
BIND : 'bind' ;
COMPOSITION : '|' ;
SEND : '!' ;
RECEIVE : '?' ;
COMMA : ',' ;
LPAREN : '(' ;
RPAREN : ')' ;
LBRACKET : '[' ;
RBRACKET : ']' ;
STRING: '"' ( ~["\r\n]* ) '"';
CHANNEL: [a-zA-Z_][a-zA-Z_0-9]* ;


program
    : statements EOF
    ;

statements
    : statement
    | statements statement
    ;

statement
    : RUN LPAREN agent RPAREN
    ;

agent
    : inaction
    | solo
    | agent COMPOSITION agent
    | LPAREN agent RPAREN COMPOSITION agent
    | agent COMPOSITION LPAREN agent RPAREN
    | LPAREN agent RPAREN COMPOSITION LPAREN agent RPAREN
    | BIND channelList LPAREN agent RPAREN
    | MATCH channelList channelList LPAREN agent RPAREN
    ;

inaction
    : LPAREN RPAREN
    ;

solo
    : CHANNEL (SEND | RECEIVE) (channelList | CHANNEL)
    | PRINT SEND STRING
    ;

innerList
    : CHANNEL
    | innerList COMMA CHANNEL
    ;

channelList
    : LBRACKET innerList RBRACKET
    ;