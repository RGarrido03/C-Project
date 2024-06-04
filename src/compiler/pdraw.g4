grammar pdraw;
// import Elements;
import Class;

main: (statement)* EOF;
statement: (
		instruction
		| addOrSubPointToPen
		| assignment
		| if
		| for
		| while
		| class
		| object
		| execute
		| print
		| stdin
		| pause
		| instructionsCanvas
		| incdec
		| array
		| addArray
		| removeArray
		| functionDefinition
		| functionCall /// apenas nas funcoes
		| returnStatement // Nao permitir no semantico que seja usado o return fora de uma funcao
	) ';';

array:
	Type variable '=' '[' (expression (',' expression)*)? ']';

addArray: variable '[' expression ']' '=' expression;

removeArray: 'del' variable '[' expression ']';

// high level stuff Function Definitions
functionDefinition:
	'def' Type functionName '(' parameters? ')' '{' statement* '}';

functionName: Name | Word;

parameters: parameter (',' parameter)*;

parameter: type=(Type|'pen') variable;

arguments: expression (',' expression)*;

returnStatement: 'return' expression?;

addOrSubPointToPen:
	variable '=' variable op = ('+' | '-') tuple; // TODO REFACTOR THIS

if: 'if' '(' expression ')' '{' statement* '}' elseif* else?;
elseif: 'else' 'if' '(' expression ')' '{' statement* '}';
else: 'else' '{' statement* '}';

for:
	'for' '(' assignment ';' expression ';' assignment ')' '{' statement* '}';
while:
	op = ('until' | 'while') '(' expression ')' '{' statement* '}';

move: moveAction expression;
rotate: rotateAction angle;
write: 'write' expression ',' expression;

instruction:
	variable (move | rotate | pause | write)+	# InstructionMoveRotateAction
	| variable penAction						# InstructionPenAction
	| variable '<-' arrowProps					# InstructionArrowProps;

assignment
	returns[types.Symbol symbol]:
	Type variable '=' expression				# AssignmentVar
	| object									# AssignmentPen // SEE ME TODO: Adicionei 2 hipoteses de assignment, ver se é necessário
	| variable '=' expression					# ReAssignmentVar
	| incdec									# ReAssignmentIncDec
	| Type (variable '=' expression (',')?)+	# AssignmentMultipleVars
	| Type variable (',' variable)*				# AssignmentVarsNoValue;

stdin: 'stdin' expression;

// Medium level
pause: 'pause' expression;
print:
	(expression) '->' 'stdout'		# stdout
	| (expression) '->' 'stderr'	# stderr;

execute: variable '<-' 'execute' STRING;

// TODO: Refactor to expression TODO aqui vai surgir uma feature poder redirecionar para todo o lado