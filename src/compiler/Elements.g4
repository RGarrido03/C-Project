grammar Elements;
variable: Name | Word;
expression
	returns[types.Symbol symbol]:
	expression op = ('/' | '*' | '%') expression	# ExprMultDivMod
	| expression op = ('+' | '-') expression		# ExprAddSub
	| op = ('+' | '-') e2 = expression				# ExprUnary
	| <assoc = right> expression '^' expression		# ExprPow
	| typeCast										# ExprCast
	| stdin											# ExprStdIn
	| INT											# ExprInteger
	| FLOAT											# ExprFloat // FIXME change this
	| String										# ExprString
	| BOOL											# ExprBool
	| variable										# ExprVariable
	| '(' expression ')'							# ExprParent;

execute: 'execute' String ';';
stdin: 'stdin' String;

tuple: '(' expression ',' expression ')';
angle:
	expression d = ('º' | 'deg')	# Degree
	| expression ('rad')?			# Radian;

moveAction:
	'forward'		# forward
	| 'backward'	# backward
	| 'left'		# left
	| 'right'		# right;

penAction: 'down' # down | 'up' # up;

Type:
	'real'
	| 'canvas'
	| 'int'
	| 'string'
	| 'bool'; //| 'pen' **REMOVED** porque a caneta tem de ser criada com o new e ja tem p `object`;
typeCast: Type '(' expression ')';

// Numerical
INT: [0-9]+;
FLOAT: [0-9]+ '.' [0-9]+;
FRACTION: INT '/' INT;
BOOL: 'true' | 'false';

// Misc

Word: [a-zA-Z]+;
Name: Word [a-zA-Z0-9_]*;
HexaColor: '#' [0-9a-fA-F]+;
ESC: '\\' .;
String: '"' (. | ESC)*? '"' | '\'' (. | ESC)*? '\'';

// .gitignore
Comment: '%' ~[\r\n]* -> skip;
WS: [ \r\t\n]+ -> skip;