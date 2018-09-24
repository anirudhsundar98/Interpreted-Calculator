lexer grammar LexerRules;

ID  : [a-zA-Z]+;
INT : [0-9]+;
MUL : '*';
DIV : '/';
SUB : '-';
ADD : '+';
NEWLINE: '\r'* '\n';
WS  : [ \t]+ -> skip;