import sys
from antlr4 import *
from ipdrawLexer import ipdrawLexer
from ipdrawParser import ipdrawParser
from generated_files.interpeter import Interpreter 

def main(filename):
   ## TODO tem de ser um filestream !!!!
   input_stream = FileStream(filename, encoding='utf-8')
   lexer = ipdrawLexer(input_stream)
   stream = CommonTokenStream(lexer)
   parser = ipdrawParser(stream)
   tree = parser.main()
   ## passar a tree para o meu visitor ipdraw
   visitor = Interpreter()
   visitor.visit(tree)

if __name__ == '__main__':
   file="../../examples/p1.ipdraw"
   main(file)
