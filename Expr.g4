grammar Expr;
start_ : expr ('\n' | expr)* EOF;
expr : assignment | if_else_block;
COMMENT: '#' ~[\r\n]* -> skip ;
BLOCK_COMMENT : ('\'\'\'' .*? '\'\'\'' | '"""' .*? '"""') -> skip ;
arethmetic :(char)* space ('+' | '-' | '/' | '*' | '%') space char (arethmetic)*;
assignment : char space '=' space char | char space '+=' space char | char space '-=' space char | char space '*=' space char | char space '/=' space char | char space '=' space arethmetic | char space '=' space array | char space '=' space string;
array : '['(arrchars)*']';
arrchars : char',' space | char;
if_else_block: if_block '\n' (else_block | elif_block | );
if_block: 'if' space condition_statement ':' ('\n' tab expr)+ ;
else_block: 'else:' ('\n' tab expr)+ ;
elif_block: 'elif' space condition_statement ':' ('\n' tab expr)+ ('\n' else_block | '\n' elif_block | );
condition: var space ('==' | '!=' | '<' | '<=' | '>' | '>=') space var |
'not' space var |
'(' condition ')';
condition_statement: condition (space 'and' space condition | space 'or' space condition)*;
var: char | array | string;
string: char (space char)*;
char : NUMS | VALIDWORDS;
NUMS : ('-'|)[0-9.]+ ;
VALIDWORDS : [A-Za-z"._'0-9]+;
WS : [\r]+ -> skip ;
tab : ('    ')+;
space : ' ' | ;