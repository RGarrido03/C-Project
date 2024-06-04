from abc import ABC, abstractmethod
from antlr4 import FileStream, CommonTokenStream
import time
import sys
import turtle
import math

from lib import *
from interpeter import Interpreter
from ipdrawLexer import ipdrawLexer
from ipdrawParser import ipdrawParser


class DefaultPen(Pen):
    def __init__(self) -> None:
        super().__init__()


class PenType1__(Pen):
    def __init__(self) -> None:
        super().__init__()
        self.color = "green"
        self.position = ((10 + 2) - 2,a__)
        self.orientation = math.radians((a__ + 35))
        self.thickness = a__
        self.pressure = -1 / 1


def execute(filename: str, pen: Pen):
    input_stream = FileStream(filename, encoding='utf-8')
    lexer = ipdrawLexer(input_stream)
    stream = CommonTokenStream(lexer)
    parser = ipdrawParser(stream)
    tree = parser.main()
    visitor = Interpreter(pen)
    visitor.visit(tree)


Canvas1__ = Canvas("Example 1",(200 / 2,100 * 1))
Canvas2__ = Canvas("Example 2",)
Canvas.set_active(Canvas1__)

Canvas1__.set_background("pink")

a__: int = 10
b__: int = 1

c__: float = 1.0
d__: str = "hi " + "honey"
e__: bool = b__ == c__
f__: bool = c__ < a__
g__: int = int("10")
h__: str = str(10)
p1__ = PenType1__()
print(p1__)
a__ = int(input(input("Choose the name for your stdin: ")))
p1__.forward(10)
time.sleep(10000/1_000_000)
p1__.left(math.degrees(10))
p1__.forward(20)
p1__.set_position((100,100))
p1__.set_color("red")

if not (e__):
    print("This shouldn't be printed")
elif e__:
    print("Let's gooo")
else:
    print("This shouldn't be printed")

s__: str = ""

while  (s__ != "y" and s__ != "Y"):
    s__ = input("Continue? y/n: ")


while not (s__ == "n" or s__ == "N"):
    s__ = input("Not continue? y/n: ")


i__: int = 0
while  (i__ < 5):
    print(i__, file=sys.stderr)
    i__ = i__ + 1

print(math.pi)
p1__.add_position((20,20))
p1__.set_speed(15)
def function_no_args__()->int:
    print("hi from a no-arg function")
    return 0
def function_with_args__(a__: str, )->str:
    print(a__)
    return a__
function_no_args__()
z__: str = function_with_args__("ola",)
p1__.write("pdraw-t02", 16)
(a__:=a__+1)
print(a__)
(a__:=a__-1)
print(a__)
Canvas.set_active(Canvas2__)

execute("../../examples/self_made/test_ipdraw.ipdraw", p1__)
print("Everything is done, please close the window.")
turtle.done()
