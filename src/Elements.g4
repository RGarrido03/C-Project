grammar Elements;
variable: Name;
expression:
	expression op = ('*' | '/' | '%') expression	# ExprMultDivMod
	| expression op = ('+' | '-') expression		# ExprAddSub
	| INT											# ExprInteger
	| FLOAT											# ExprFloat
	| <assoc = right> expression '^' expression		# ExprPow
	| Name											# ExprId
	| '(' expression ')'							# ExprParent;

execute: 'execute' String ';';

tuple: '(' expression ',' expression ')';
angle:
	expression ('º' | 'deg')	# Degree
	| expression ('rad')?		# Radian;

moveAction:
	'forward'		# forward
	| 'backward'	# backward
	| 'left'		# left
	| 'right'		# right;

penAction: 'down' # down | 'up' # up;

Type: 'pen' | 'real' | 'canvas' | 'int' | 'string' | 'bool';
typeCast: Type '(' expression ')';

// Numerical
INT: [0-9]+;
FLOAT: [0-9]+ '.' [0-9]+;
FRACTION: INT '/' INT;

// Misc
Word: [a-zA-Z]+;
Name: Word [a-zA-Z0-9_]*;
ESC: '\\' .;
String: '"' (. | ESC)*? '"' | '\'' (. | ESC)*? '\'';

// .gitignore
Comment: '%' ~[\r\n]* -> skip;
WS: [ \r\t\n]+ -> skip;