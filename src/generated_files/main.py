from abc import ABC, abstractmethod
import time
import sys
import turtle
import math
from lib import Pen

class DefaultPen(Pen):
    def __init__(self) -> None:
        super().__init__()

class PenType1__(Pen):
    def __init__(self) -> None:
        super().__init__()
        self.color = "green"
        self.position = (10,10)
        self.orientation = 45.0
        self.thickness = 10
        self.pressure = -1

p1__ = PenType1__()
p1__.down( )
p1__.write("ola" ,30)
p1__.forward(10 )
p1__.right(144.0 )
p1__.forward(10 )
p1__.right(144.0 )
p1__.write("hello world" ,30)
turtle.done()