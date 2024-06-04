grammar Elements;
import pdraw;
variable: Name | Word;
expression
	returns[types.Symbol symbol]:
	Constant															# ExprConst
	| expression op = ('+' | '-' | '/' | '//' | '*' | '^') expression	# ExprAddSubMultDivModPow
	// SEEME this shit makes everything wrong
	| op = ('+' | '-') e2 = expression						# ExprUnary
	| op = ('~' | '!' | 'not') expression					# ExprConditionNot
	| expression op = ('==' | '!=') expression				# ExprConditionEquals
	| expression op = ('<' | '<=' | '>' | '>=') expression	# ExprConditionOrderRelation
	| expression op = ('and' | 'or') expression				# ExprConditionAndOr
	| typeCast												# ExprCast
	| stdin													# ExprStdIn
	| incdec												# ExprIncDec
	| getArray												# ExprArray
	| getLength												# ExprLength
	| INT													# ExprInteger
	| FLOAT													# ExprFloat // FIXME change this
	| STRING												# ExprString
	| BOOL													# ExprBool
	| variable												# ExprVariable
	| functionCall											# ExprFunctionCall
	| '(' expression ')'									# ExprParent;

getLength: 'len' variable;

getArray: variable '[' expression ']';

functionCall: functionName '(' arguments? ')';

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
BOOL: 'true' | 'false';

// Misc

Constant: 'PI' | 'E' | 'TAU';
Word: [a-zA-Z]+; // quero que nao permita Const
Name: Word [a-zA-Z0-9_]*;
HexaColor: '#' [0-9a-fA-F]+;
ESC: '\\' .;
STRING: '"' (. | ESC)*? '"' | '\'' (. | ESC)*? '\'';

// .gitignore
Comment: '%' ~[\r\n]* -> skip;
WS: [ \r\t\n]+ -> skip;