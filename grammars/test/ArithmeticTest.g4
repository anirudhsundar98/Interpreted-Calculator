grammar ArithmeticTest;
import LexerRules;

prog: statement+;

statement: ID '=' expr NEWLINE   # Assign
         | expr NEWLINE          # PrintExpr
         | NEWLINE               # Blank
         ;

expr: expr op=(MUL|DIV) expr    # Mul
    | expr op=(ADD|SUB) expr    # Add
    | INT                       # int
    | ID                        # id
    | '(' expr ')'              # parens
    ;
