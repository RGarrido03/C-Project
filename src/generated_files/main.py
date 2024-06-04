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


myRealVar__: float = 1.0
myIntVar__: int = 1
myIntVar2__: float = (1 + 1 + 1) * 1 + 9 / 8
print("Everything is done, please close the window.")
turtle.done()
