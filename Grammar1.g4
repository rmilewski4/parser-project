grammar Grammar1;

// Start rule
start: (statement NEWLINE)* EOF;

// Statements
statement: assignment
         | if_statement
         | while_loop
         | for_loop
         | expression;

// Assignment
assignment: ID '=' expression;

// If statements
if_statement: 'if' expression ':' suite ('elif' expression ':' suite)* ('else' ':' suite)?;

// Loops
while_loop: 'while' expression ':' suite;
for_loop: 'for' ID 'in' expression ':' suite;

// Expression
expression: arithmetic_expression;

arithmetic_expression: atom (op=('*' | '/' | '+' | '-') atom)*;

atom: INT | ID | '(' expression ')';

// Suite (block of statements)
suite: INDENT (statement NEWLINE*)+ DEDENT;

// Terminal rules
ID: [a-zA-Z_][a-zA-Z0-9_]*;
INT: [0-9]+;
NEWLINE: '\r'? '\n';
INDENT: '    ';
DEDENT: [ \t]* '\r'? '\n';

// Skip whitespace
WS: [ \t]+ -> skip;

// Comments
COMMENT: '#' ~[\r\n]* -> skip;

