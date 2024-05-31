// ipdraw linguagem apenas para uma caneta ja recebe o objeto caneta e portanto não precisa de criar
// um objeto caneta
grammar ipdraw;
///{0..9} riqueza da linguagem consts para desenhos pi , euler, tau, phi, desenhar arcos, circulos,
// retas, poligonos, elipses, ... funcoes variaveis para guardar valores de desenhos labda functions
// ...... VERY ADVANCED
main: (statement)* EOF;

statement: (
		instruction
		| assignment
		| ifStatement
		// | execute
		| whileLoop
		| forLoop
		| print
		| stdin
		| pause
	) ';';

ifStatement:
	'if' '(' condition ')' '{' statement* '}' (
		'else' '{' statement* '}'
	)?;

whileLoop:
	cicle = ('while' | 'until') '(' condition ')' '{' statement* '}';
forLoop:
	'for' '(' assignment ';' condition ';' assignment ')' '{' statement* '}' (
		'finaly' '{' statement* '}'
	)?;

condition:
	('¬' | '!' | 'not') condition			# ConditionNot
	| expression ('==' | 'eq') expression	# ConditionEquals
	| expression ('!=' | 'neq') expression	# ConditionNotEquals
	| expression ('<' | 'lt') expression	# ConditionLessThan
	| expression ('>' | 'gt') expression	# ConditionGreaterThan
	| expression ('<=' | 'lte') expression	# ConditionLessEqual
	| expression ('>=' | 'gte') expression	# ConditionGreaterEqual
	| expression ('&&' | 'and') expression	# ConditionAnd
	| expression ('||' | 'or') expression	# ConditionOr
	| '(' condition ')'						# ConditionParentheses;
// TODO bitwise?

instruction:
	moveAction expression	# InstructionMoveAction
	| rotateAction angle	# InstructionRotateAction
	| penAction				# InstructionPenAction
	| arrowProps			# InstructionArrowProps;

assignment:
	Type variable '=' expression	# AssignmentVar
	| variable '=' expression		# ReAssignmentVar;

stdin: 'stdin' expression;

// Medium level
pause: 'pause' INT;
print:
	(expression) '->' 'stdout'		# stdout
	| (expression) '->' 'stderr'	# stderr;

// execute: variable '<-' 'execute' STRING; FIX ME um interpretador pode chamar outro interpretador

variable: Name | Word;

expression:
	expression op = ('/' | '//' | '*' | '%') expression	# ExprMultDivMod
	| expression op = ('+' | '-') expression			# ExprAddSub
	| op = ('+' | '-') e2 = expression					# ExprUnary
	| <assoc = right> expression '^' expression			# ExprPow
	| typeCast											# ExprCast
	| stdin												# ExprStdIn
	| INT												# ExprInteger
	| FLOAT												# ExprFloat
	| STRING											# ExprString
	| BOOL												# ExprBool
	| variable											# ExprVariable
	| '(' expression ')'								# ExprParent;

tuple: '(' expression ',' expression ')';
angle:
	expression d = ('º' | 'deg')	# Degree
	| expression ('rad')?			# Radian;

rotateAction: 'left' # left | 'right' # right;

moveAction: 'forward' # forward | 'backward' # backward;

penAction: 'down' # down | 'up' # up;

arrowProps:
	'color' (Word | HexaColor)
	| 'position' tuple
	| 'orientation' angle
	| 'thickness' expression
	| 'pressure' expression;

Type: 'real' | 'canvas' | 'int' | 'string' | 'bool';
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