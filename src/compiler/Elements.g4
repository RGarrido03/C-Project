grammar Elements;
variable: Name | Word;
expression
	returns[types.Symbol symbol]:
	expression op = ('+' | '-' | '/' | '//' | '*' | '^') expression # ExprAddSubMultDivModPow
		// SEEME this shit makes everything wrong
	| op = ('+' | '-') e2 = expression						# ExprUnary
	| expression op = ('==' | '!=') expression				# ExprConditionEquals
	| expression op = ('<' | '<=' | '>' | '>=') expression	# ExprConditionOrderRelation
	| expression op = ('and' | 'or') expression				# ExprConditionAndOr
	| typeCast												# ExprCast
	| stdin													# ExprStdIn
	| incdec												# ExprIncDec
	| INT													# ExprInteger
	| FLOAT													# ExprFloat // FIXME change this
	| STRING												# ExprString
	| BOOL													# ExprBool
	| variable												# ExprVariable
	| '(' expression ')'									# ExprParent;

stdin: 'stdin' expression;

tuple: '(' expression ',' expression ')';
angle:
	expression d = ('º' | 'deg')	# Degree
	| expression ('rad')?			# Radian;

rotateAction: 'left' # left | 'right' # right;

moveAction: 'forward' # forward | 'backward' # backward;

penAction: 'down' # down | 'up' # up;

incdec: variable op = ('++' | '--');

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
STRING: '"' (. | ESC)*? '"' | '\'' (. | ESC)*? '\'';

// .gitignore
Comment: '%' ~[\r\n]* -> skip;
WS: [ \r\t\n]+ -> skip;