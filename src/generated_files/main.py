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
resultado__: int = loca__(1,2,3,)
print("Everything is done, please close the window.")
turtle.done()
