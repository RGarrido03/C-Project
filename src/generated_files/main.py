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
        self.orientation = math.radians(45)
        self.thickness = 10
        self.pressure = -1

Canvas1__ = Canvas("Example 1",(100,100))
p1__ = PenType1__()
p1__.down( )
p1__.forward(10 )
p1__.set_color("red")
p1__.left(math.degrees(10) )
p1__.backward(10 )
p1__.set_color("blue")
p1__.right(math.degrees(20) )
p1__.forward(10 )
x__: int = 5
y__: int = 10

p1__.set_position((x__,y__))
x__ = int(input("x: "))
y__ = int(input("y: "))
p1__.set_position((x__,y__))
print(p1__)
print("\n")
time.sleep(10000/1_000_000)
p1__.forward(10 )
time.sleep(10000/1_000_000)
p1__.left(math.degrees(10) )
p1__.forward(20 )
p1__.set_position((0,0))
p1__.down( )
p1__.forward(10 )
p1__.right(math.degrees(math.radians(144)) )
p1__.forward(10 )
p1__.right(math.degrees(math.radians(144)) )
p1__.forward(10 )
p1__.right(math.degrees(math.radians(144)) )
p1__.forward(10 )
p1__.right(math.degrees(math.radians(144)) )
p1__.forward(10 )
p1__.add_position((5,5))
p1__.set_color("green")
i__: int = 0

i__ = 0
while  (i__ < 5):
    p1__.forward(10 )
    p1__.right(math.degrees(math.radians(144)) )
    i__ = i__ + 1

pn__ = DefaultPen()
pn__.set_color("blue")
pn__.set_thickness(10)
pn__.set_pressure(1 / 2)
length__: int = 0
angle__: float = 0.0
done__: bool = False

while not (done__):
    length__ = int(input("length: "))
    p1__.forward(length__ )
    angle__ = float(input("rotation angle (degrees): ")) * math.pi / 180
    p1__.left(math.degrees(angle__) )
    t__: str = input("finish (y/N)?: ")
    done__ = (t__ == "y") or (t__ == "Y")

turtle.done()
print("Everything is done, please close the window.")
