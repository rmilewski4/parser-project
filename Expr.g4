grammar Expr;
start_ : expr ('\n' | expr)* EOF;
expr : assignment | if_else_block;
arethmetic :(char)* ('+' | '-' | '/' | '*' | '%') char (arethmetic)*;
assignment : char '=' char | char '+=' char | char '-=' char | char '*=' char | char '/=' char | char '=' arethmetic | char '=' array | char '=' string;
array : '['(arrchars)*']';
arrchars : char',' | char;
if_else_block: if_block (else_block | elif_block | );
if_block: 'if' condition_statement ':' (expr)+ ;
else_block: 'else:' (expr)+ ;
elif_block: 'elif' condition_statement ':' (expr)+ (else_block | elif_block | );
condition: var ('==' | '!=' | '<' | '<=' | '>' | '>=') var |
'not' var |
'(' condition ')';
condition_statement: condition ('and' condition | 'or' condition)*;
var: char | array | string;
string: char (char)*;
char : NUMS | VALIDWORDS;
NUMS : [0-9.]+ ;
VALIDWORDS : [A-Za-z"._'0-9]+;
WS : [ \t\n\r]+ -> skip ;