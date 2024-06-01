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

Canvas1__ = Canvas((100,100))
p1__ = PenType1__()
p1__.down()
p1__.forward(10)
p1__.color = "red"
p1__.left(572.9577951308232)
p1__.backward(10)
p1__.color = "blue"
p1__.right(1145.9155902616465)
p1__.forward(10)
turtle.done()