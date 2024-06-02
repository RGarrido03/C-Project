from abc import ABC, abstractmethod
import time
import sys
import turtle
import math
from lib import *

class DefaultPen(Pen):
    def __init__(self) -> None:
        super().__init__()

class PenType2__(Pen):
    def __init__(self) -> None:
        super().__init__()
        self.color = "blue"
        self.position = (int(width__) // 2,int(height__) // 2)

width__: float = float(input("width: "))
height__: float = float(input("height: "))
Canvas1__ = Canvas((width__,height__))
Canvas2__ = Canvas((width__ * 2,height__ * 2))
Canvas1__.set_background("green")

Canvas2__.set_background("red")

p2__ = PenType2__()
Canvas.set_active(Canvas1__)

p2__.down()
p2__.backward(float(input("size: ")))
p2__.forward(10)
p2__.right(144.0)
p2__.forward(10)
p2__.right(144.0)
p2__.forward(10)
p2__.right(144.0)
p2__.forward(10)
p2__.right(144.0)
p2__.forward(10)
Canvas.set_active(Canvas2__)

p2__.down()
p2__.backward(float(input("size: ")))
p2__.forward(10)
p2__.right(144.0)
p2__.forward(10)
p2__.right(144.0)
p2__.forward(10)
p2__.right(144.0)
p2__.forward(10)
p2__.right(144.0)
p2__.forward(10)
turtle.done()