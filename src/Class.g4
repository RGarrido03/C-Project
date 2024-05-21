grammar Class;
import Elements;

class: 'define' 'pen' variable '{' classProps* '}';

classProps:
	'color' '=' Word
	| 'position' '=' tuple
	| 'orientation' '=' angle
	| 'thickness' '=' expression
	| 'pressure' '=' expression;
// TODO: Adapt to any keyword TODO: General expressions instead of hardcoded ones

object: 'pen' variable '=' 'new' variable ';';