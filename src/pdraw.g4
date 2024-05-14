grammar pdraw;
main: (statement)* EOF;
statement: rUBEN ';' | class;

class: 'define' 'pen' variable '{' classProps* '}';

rUBEN: object |;

object: 'pen' variable '=' 'new' variable ';';

// position ( 1 0 , 1 0 ) ; | down ; TODO every option
instruction:
	InstrName
	| InstrName tuple // position instructon
	| InstrName angle // rotation
	| variable InstrName (angle | tuple); // p1 down - opcional

atribuicaoDeValor: variable '=' expression ';';

classProps:
	'color' '=' Word
	| 'position' '=' tuple
	| 'orientation' '=' angle
	| 'thickness' '=' INT
	| 'pressure' '=' FRACTION
	| INT;
// TODO: Adapt to any keyword

// Complex elements
variable: Name;
tuple: '(' INT ',' INT ')';
angle: INT ('º' | 'deg') # Degree | INT ('rad')? # Radian;

// Medium level
cast: Type '(' expression ')' ';';
pause: 'pause' INT ';';
print: variable '->' 'stdout' ';';
// TODO aqui vai surgir uma feature poder redirecionar para todo o lado

// elements
Type: 'pen' | 'real' | 'canvas';
INT: [0-9]+;
FRACTION: INT '/' INT;

Word: [a-zA-Z]+;
Name: Word [a-zA-Z0-9]*;
InstrName: [a-z]+;

Comment: '%' ~[\r\n]* -> skip;
WS: [ \r\t\n]+ -> skip;