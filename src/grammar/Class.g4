grammar Class;
import Elements;

class:
	'define' 'canvas' variable String? tuple?			# CreateCanvas
	| 'define' 'pen' variable '{' (classProps ';')* '}'	# CreatePen;

classProps:
	'color' '=' (Word | HexaColor)
	| 'position' '=' tuple
	| 'orientation' '=' angle
	| 'thickness' '=' expression
	| 'pressure' '=' expression;
// TODO: Adapt to any keyword TODO: General expressions instead of hardcoded ones

object: 'pen' variable '=' 'new' variable?;