grammar Class;
import Elements;

class:
	'define' 'canvas' variable STRING? tuple?			# CreateCanvas
	| 'define' 'pen' variable '{' (classProps ';')* '}'	# CreatePen;

instructionsCanvas:
	variable 'background' (Word | HexaColor)	# BackgroundCanvas
	| 'set' variable							# SetCanvas;

classProps:
	'color' '=' (Word | HexaColor)
	| 'position' '=' tuple
	| 'orientation' '=' angle
	| 'thickness' '=' expression
	| 'pressure' '=' expression;
// TODO: Adapt to any keyword TODO: General expressions instead of hardcoded ones

arrowProps:
	op = 'color' (Word | HexaColor)
	| op = 'position' tuple
	| op = 'orientation' angle
	| op = 'thickness' expression
	| op = 'pressure' expression;

object: 'pen' variable '=' 'new' variable?;