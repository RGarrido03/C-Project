from abc import ABC, abstractmethod
import time
import sys
import turtle
import math
from lib import *

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

Canvas1__ = Canvas("Example 1",(100,100))
p1__ = PenType1__()
p1__.down( )
p1__.forward(10 )
p1__.color = "red"
p1__.left(572.9577951308232 )
p1__.backward(10 )
p1__.color = "blue"
p1__.right(1145.9155902616465 )
p1__.forward(10 )
x__: int = 5
y__: int = 10

p1__.position = (x,y)
x__ = int(input("x: "))
y__ = int(input("y: "))
p1__.position = (x,y)
print(p1__)
print("\n")
time.sleep(10000/1000)
p1__.forward(10 )
time.sleep(10000/1000)
p1__.left(572.9577951308232 )
p1__.forward(20 )
p1__.position = (0,0)
p1__.down( )
p1__.forward(10 )
p1__.right(144.0 )
p1__.forward(10 )
p1__.right(144.0 )
p1__.forward(10 )
p1__.right(144.0 )
p1__.forward(10 )
p1__.right(144.0 )
p1__.forward(10 )
p1__.color = "green"
i__: int = 0

i__ = 0
while i__ < 5:
    p1__.forward(10 )
    p1__.right(144.0 )
    i__ = i__ + 1

pn__ = DefaultPen()
pn__.color = "blue"
pn__.thickness = 10
pn__.pressure = 1
turtle.done()