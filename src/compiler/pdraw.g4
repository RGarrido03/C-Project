grammar pdraw;
// import Elements;
import Class;

main: (statement)* EOF;
statement: (
		instruction
		| assignment
		| if
		| while
		| class
		| object
		| execute
		| print
		| stdin
		| pause
		| instructionsCanvas
	) ';';

if: 'if' '(' expression ')' '{' statement* '}' elseif* else?;
elseif: 'else' 'if' '(' expression ')' '{' statement* '}';
else: 'else' '{' statement* '}';
while: 'until' '(' expression ')' '{' statement* '}';

move: moveAction expression;
rotate: rotateAction angle;

instruction:
	variable (move | rotate | pause)+   # InstructionMoveRotateAction
	| variable penAction	            # InstructionPenAction
	| variable '<-' arrowProps          # InstructionArrowProps;

assignment
	returns[types.Symbol symbol]:
	Type variable '=' expression				# AssignmentVar
	| object									# AssignmentPen // SEE ME TODO: Adicionei 2 hipoteses de assignment, ver se é necessário
	| variable '=' expression					# ReAssignmentVar
	| Type (variable '=' expression (',')?)+	# AssignmentMultipleVars;

stdin: 'stdin' expression;

// Medium level
pause: 'pause' INT;
print:
	(expression) '->' 'stdout'		# stdout
	| (expression) '->' 'stderr'	# stderr;

execute: variable '<-' 'execute' STRING;
// TODO: Refactor to expression TODO aqui vai surgir uma feature poder redirecionar para todo o lado