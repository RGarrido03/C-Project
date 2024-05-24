grammar pdraw;
// import Elements;
import Class;

main: (statement)* EOF;
statement: (
		instruction
		| assignment
		| cast
		| class
		| object
		| execute
		| print
		| pause
	) ';';

instruction:
	variable moveAction angle	# InstructionMoveAction
	| variable penAction		# InstructionPenAction;

assignment
	returns[types.Symbol symbol]:
	Type variable '=' expression	# AssignmentVar
	| object						# AssignmentPen // SEE ME TODO: Adicionei 2 hipoteses de assignment, ver se é necessário
	| variable '=' expression		# ReAssignmentVar;

// Medium level
cast: Type '(' expression ')' ';';
pause: 'pause' INT;
print:
	(expression | variable | STRING) '->' 'stdout'	# stdout
	| (expression | STRING) '->' 'stderr'			# stderr;

execute: variable '<-' 'execute' STRING;
stdin: 'stdin' STRING;
// TODO: Refactor to expression TODO aqui vai surgir uma feature poder redirecionar para todo o lado