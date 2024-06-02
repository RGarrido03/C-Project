from abc import ABC, abstractmethod
import time
import sys
import turtle
import math
from lib import *

class DefaultPen(Pen):
    def __init__(self) -> None:
        super().__init__()


pila__: int = 2
x__: int = 9
y__: int = pila__ + 10

w__: int = 0
a__: int = 1
(a__:=a__+1)
b__: int = (a__:=a__+1) + 2
turtle.done()