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


def myFunc1__(k__: int, )->int:
    print("Hello from a function")
    return myFunc1__(7,)
def loca__(i__: int, j__: int, w__: int, )->int:
    print("Hello from another function")
    return i__ + 1
def recursiveThing__(i__: int, )->int:

    if i__ < 10:
        print("Hello from recursiveThing my var i is" + str(i__))
        return recursiveThing__(i__ + 1,)

    return 0
def recursiveWithPen__(p__: Pen, i__: int, )->int:

    if i__ < 100:
        p__.left(math.degrees(math.radians((360 / 100))))
        p__.forward(10 * math.pi)
        return recursiveWithPen__(p__,i__ + 1,)

    return 0
def funcPartir__(p__: Pen, )->int:
    return loca__(1,2,3,)
resultado__: int = loca__(1,2,3,)
resultadoRecursivo__: int = recursiveThing__(0,)
print("FIM")
a__: int = 5
p__ = PenType1__()
p__.down()
resultadoRecursivoComPen__: int = recursiveWithPen__(p__,0,)
print("Everything is done, please close the window.")
turtle.done()
