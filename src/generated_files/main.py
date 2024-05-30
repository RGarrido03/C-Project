from abc import ABC, abstractmethod
import time
import sys
import turtle
import math
from lib import Pen

class DefaultPen(Pen):
    def __init__(self) -> None:
        super().__init__()


<<<<<<< HEAD
class PenType2__(Pen):
    def __init__(self) -> None:
        super().__init__()
        self.color = "blue"
        self.position = (2,2)


width__: float = float(input("width: "))

height__: float = float(input("height: "))

turtle.setup(width__,height__)
turtle.title("Example p2")
p2__ = PenType2__()
print(p2__)
print("\n")
time.sleep(10000/1000)
pass__: str = "passei"
p2__.down()
p2__.backward(float(input("size: "))
)
p2__.forward(10)
p2__.right(144.0)
p2__.forward(10)
p2__.right(144.0)
p2__.forward(10)
p2__.right(144.0)
p2__.forward(10)
p2__.right(144.0)
p2__.forward(10)
=======
add: int = 2+4
sub: int = 7-6
div: int = 9/1
mult: int = 1*8
>>>>>>> 8996b2af695e81232903068a559931ab91bd5a16

turtle.done()
