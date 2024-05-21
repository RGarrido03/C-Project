grammar pdraw;
// import Elements;
import Class;

main: (statement)* EOF;
statement: (
		instruction
		| assignment
		| class
		| object
		| execute
		| print
		| pause
	) ';';

instruction:
	variable moveAction angle	# InatructionMoveAction
	| variable penAction		# InstructionPenAction;

assignment: Type variable '=' expression;

// Medium level
cast: Type '(' expression ')' ';';
pause: 'pause' INT;
print:
	(expression | variable | String) '->' 'stdout'	# stdout
	| (expression | String) '->' 'stderr'			# stderr;

execute: variable '<-' 'execute' String;
// TODO: Refactor to expression TODO aqui vai surgir uma feature poder redirecionar para todo o lado