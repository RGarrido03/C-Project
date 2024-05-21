grammar pdraw;
// import Elements;
import Class;

main: (statement)* EOF;
statement: (instruction | assignment | class | object) ';';

instruction:
	variable moveAction angle	# ElementsMoveAction
	| variable penAction		# ElementsPenAction;

assignment: variable '=' expression ';';

// Medium level
cast: Type '(' expression ')' ';';
pause: 'pause' INT ';';
stdin: 'stdin' '"';
print:
	expression '->' 'stdout' ';'	# stdout
	| expression '->' 'stderr' ';'	# stderr;
// TODO: Refactor to expression TODO aqui vai surgir uma feature poder redirecionar para todo o lado