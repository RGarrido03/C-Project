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


class PenType2__(Pen):
    def __init__(self) -> None:
        super().__init__()
        self.color = "blue"
        self.position = (int(width__) // 2,int(height__) // 2)


def execute(filename: str, pen: Pen):
    input_stream = FileStream(filename, encoding='utf-8')
    lexer = ipdrawLexer(input_stream)
    stream = CommonTokenStream(lexer)
    parser = ipdrawParser(stream)
    tree = parser.main()
    visitor = Interpreter(pen)
    visitor.visit(tree)


width__: float = float(input("width: "))
height__: float = float(input("height: "))
Canvas1__ = Canvas("Example p2",(width__,height__))
p2__ = PenType2__()
print(p2__)
print("\n")
time.sleep(10000/1_000_000)
pass__: str = "passei"
p2__.down()
p2__.backward(float(input("size: ")))
p2__.forward(10)
p2__.right(math.degrees(math.radians(144)))
p2__.forward(10)
p2__.right(math.degrees(math.radians(144)))
p2__.forward(10)
p2__.right(math.degrees(math.radians(144)))
p2__.forward(10)
p2__.right(math.degrees(math.radians(144)))
p2__.forward(10)
print("Everything is done, please close the window.")
turtle.done()
