from abc import ABC, abstractmethod
import time
import sys
import turtle
import math
from lib import *

class DefaultPen(Pen):
    def __init__(self) -> None:
        super().__init__()

mycanvas = Canvas("Example p2", (500, 500), "white")
Canvas.set_active(mycanvas)
another =  Canvas("Example p2", (700, 700), "red")

mypen = DefaultPen()
mypen.set_color("blue")
mypen.set_thickness(3)
mypen.set_position((200, 200))
mypen.set_orientation(90)
mypen.down()
for i in range(10):
    mypen.forward(100)
    mypen.left(36)

Canvas.set_active(another)

mypen.set_color("blue")
mypen.set_thickness(3)
mypen.set_position((200, 200))
mypen.set_orientation(90)
for i in range(10):
    mypen.forward(100)
    mypen.left(36)







add__: int = 3 + 1
sub__: int = 3 - 1
mul__: int = 3 * 1
div__: float = 3 / 1
dre__: int = 3 // 1
pow__: int = 3 ^ 2
par__: int = (3 + 2) * 4
word__: str = "Bruno" + "Lopes"
turtle.done()