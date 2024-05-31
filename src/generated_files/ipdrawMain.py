import sys
from antlr4 import *
from ipdrawLexer import ipdrawLexer
from ipdrawParser import ipdrawParser
from interpeter import Interpreter 
from lib import *

class PenType2__(Pen):
    def __init__(self) -> None:
        super().__init__()
        self.color = "blue"
        self.position = (2,2)

def main(filename):
   pen = PenType2__()
   ## TODO tem de ser um filestream !!!!
   input_stream = FileStream(filename, encoding='utf-8')
   lexer = ipdrawLexer(input_stream)
   stream = CommonTokenStream(lexer)
   parser = ipdrawParser(stream)
   tree = parser.main()
   ## passar a tree para o meu visitor ipdraw
   visitor = Interpreter(pen)
   visitor.visit(tree)

if __name__ == '__main__':
   
   # file="../../examples/p1.ipdraw"
   file="../../examples/self_made/test_ipdraw.ipdraw"
   main(file)

