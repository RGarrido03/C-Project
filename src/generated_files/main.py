from abc import ABC, abstractmethod
import time
import sys
import turtle
import math
from lib import Pen

class DefaultPen(Pen):
    def __init__(self) -> None:
        super().__init__()


class PenType1(Pen):
    def __init__(self) -> None:
        super().__init__()
        self.color = "green"
        self.position = (10,10)
        self.orientation = 45.0
        self.thickness = 10
        self.pressure = -1


turtle.setup(100,100)
turtle.title("Example 1")
p1 = PenType1()
p1.down()
p1.forward(10)
p1.color = "red"
p1.left(572.9577951308232)
p1.backward(10)
p1.color = "blue"
p1.right(1145.9155902616465)
p1.forward(10)

turtle.done()
