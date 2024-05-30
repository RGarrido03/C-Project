grammar pdraw;
// import Elements;
import Class;

main: (statement)* EOF;
statement: (
		instruction
		| assignment
		| if
		| class
		| object
		| execute
		| print
		| stdin
		| pause
	) ';';

if: 'if' '(' condition ')' '{' statement* '}';

condition:
    expression '==' expression      # ConditionEquals
    | expression '!=' expression    # ConditionNotEquals
    ;

instruction:
	variable moveAction expression	# InstructionMoveAction
	| variable rotateAction angle	# InstructionRotateAction
	| variable penAction			# InstructionPenAction
	| variable '<-' arrowProps  # InstructionArrowProps;

assignment
	returns[types.Symbol symbol]:
	Type variable '=' expression	# AssignmentVar
	| object						# AssignmentPen // SEE ME TODO: Adicionei 2 hipoteses de assignment, ver se é necessário
	| variable '=' expression		# ReAssignmentVar;

stdin: 'stdin' expression;

// Medium level
pause: 'pause' INT;
print:
	(expression) '->' 'stdout'		# stdout
	| (expression) '->' 'stderr'	# stderr;

execute: variable '<-' 'execute' STRING;
// TODO: Refactor to expression TODO aqui vai surgir uma feature poder redirecionar para todo o lado