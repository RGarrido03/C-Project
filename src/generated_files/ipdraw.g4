grammar ipdraw;

// Define the main structure of the program
main: (statement)* EOF;

// Define the types of statements available
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
		| incdec
		| array
		| addArray
		| removeArray

	) ';';



array: Type variable '=' '[' (expression (',' expression)*)? ']';

addArray: variable '[' expression ']' '=' expression;

removeArray: 'del' variable '[' expression ']';

getLength: 'len' variable;

getArray: variable '[' expression ']';

// Define an if statement with optional else clause
ifStatement:
	'if' '(' condition ')' '{' statement* '}' elseIfBlock* elseBlock?;

elseIfBlock: 'else' 'if' '(' condition ')' '{' statement* '}';

elseBlock: 'else' '{' statement* '}';

// Define a while loop with 'while' or 'until' keywords
whileLoop:
	cicle = ('while' | 'until') '(' condition ')' '{' statement* '}';

// Define a for loop with optional finally block
forLoop:
	'for' '(' assignment ';' condition ';' assignment ')' '{' statement* '}' finallyBlock?;

finallyBlock: 'finally' '{' statement* '}'; //TODO

// Define conditions for if and loop statements
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

// Define instructions for the drawing actions
instruction:
	moveAction expression				# InstructionMoveAction
	| 'write' expression ',' expression	# InstructionWriteAction
	| rotateAction angle				# InstructionRotateAction
	| penAction							# InstructionPenAction
	| arrowProps						# InstructionArrowProps;

// Define assignments and reassignments
assignment:
	Type variable '=' expression (',' variable '=' expression)?	# AssignmentVar
	| variable '=' expression									# ReAssignmentVar;

// Define standard input
stdin: 'stdin' expression;

// Define pause statement
pause: 'pause' expression;

// Define print statements to stdout or stderr
print:
	expression '->' 'stdout'	# stdout
	| expression '->' 'stderr'	# stderr;

// Define variables
variable: Name | Word;

incdec: variable op = ('++' | '--');

// Define expressions for mathematical and logical operations
expression:
	expression op = ('/' | '//' | '*' | 'mod') expression	# ExprMultDivMod
	| expression op = ('+' | '-') expression				# ExprAddSub
	| op = ('+' | '-') expression							# ExprUnary
	| incdec												# ExprIncDec
	| < assoc = right> expression '^' expression			# ExprPow
	| typeCast												# ExprCast
	| stdin													# ExprStdIn
	| getArray												# ExprArray
	|getLength												# ExprLength
	| INT													# ExprInteger
	| FLOAT													# ExprFloat
	| STRING+												# ExprString
	| BOOL													# ExprBool
	| variable												# ExprVariable
	| '(' expression ')'									# ExprParent;
// TODO bitwise?

// Define tuple for coordinates or positions
tuple: '(' expression ',' expression ')';

// Define angle in degrees or radians
angle:
	expression ('º' | 'deg')	# Degree
	| expression 'rad'?			# Radian;

// Define rotation actions
rotateAction: 'left' | 'right';

// Define movement actions
moveAction: 'forward' | 'backward';

// Define pen actions
penAction: 'down' | 'up';

// Define properties for arrows
arrowProps:
	'color' (Word | HexaColor)	# ArrowColor
	| 'position' tuple			# ArrowPosition
	| 'orientation' angle		# ArrowOrientation
	| 'thickness' expression	# ArrowThickness
	| 'pressure' expression		# ArrowPressure;

// Define types for variable declaration
Type: 'real' | 'canvas' | 'int' | 'string' | 'bool';

// Define type casting
typeCast: Type '(' expression ')';

// Define numerical literals
INT: [0-9]+;
FLOAT: [0-9]+ '.' [0-9]+;
BOOL: 'true' | 'false';

// Define miscellaneous tokens
Word: [a-zA-Z]+;
Name: Word [a-zA-Z0-9_]*;
HexaColor: '#' [0-9a-fA-F]+;
ESC: '\\' .;
STRING: '"' (ESC | .)*? '"' | '\'' (ESC | .)*? '\'';

// Define comments and whitespace
Comment: (('%' .*? '\n') | ('%*' .*? '*%')) -> skip;
WS: [ \r\t\n]+ -> skip;

// ipdraw linguagem apenas para uma caneta ja recebe o objeto caneta e portanto não precisa de criar
// um objeto caneta /{0..9} riqueza da linguagem consts para desenhos pi , euler, tau, phi, desenhar
// arcos, circulos, retas, poligonos, elipses, ... funcoes variaveis para guardar valores de
// desenhos labda functions ...... VERY ADVANCED

// execute: variable '<-' 'execute' STRING; FIX ME um interpretador pode chamar outro interpretador