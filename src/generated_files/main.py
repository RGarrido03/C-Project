from abc import ABC, abstractmethod
import time
import sys
import turtle
import math



class Pen(ABC):
    def __init__(self) -> None:
        self.color = "blue"
        self.thickness = 1
        self.position = (0, 0)
        self.orientation = 0
        self.pressure = -1  # -1 means up
        self.turtle = turtle.Turtle()


    def forward(self, distance: float) -> None:
        if self.pressure >= 0:
            self.turtle.pendown()
        else:
            self.turtle.penup()
        self.turtle.forward(distance)
        self.update_position()

    def backward(self, distance: float) -> None:
        if self.pressure >= 0:
            self.turtle.pendown()
        else:
            self.turtle.penup()
        self.turtle.forward(-distance)
        self.update_position()

    def left(self, degrees: float) -> None:
        self.turtle.left(degrees)
        self.orientation = math.degrees(self.turtle.heading())

    def right(self, degrees: float) -> None:
        self.turtle.right(degrees)
        self.orientation = math.degrees(self.turtle.heading())

    def down(self) -> None:
        self.pressure = 0
        self.turtle.pendown()

    def up(self) -> None:
        self.pressure = -1
        self.turtle.penup()

    def update_position(self) -> None:
        self.position = self.turtle.position()

    def set_state(self):
        self.turtle.color(self.color)
        self.turtle.pensize(self.thickness)
        self.turtle.penup()
        self.turtle.setpos(self.position)
        self.turtle.setheading(self.orientation)
        if self.pressure >= 0:
            self.turtle.pendown()

class DefaultPen(Pen):
    def __init__(self) -> None:
        super().__init__()


class PenType2(Pen):
    def __init__(self) -> None:
        super().__init__()
        self.color = "blue"
        self.position = (int(width)//2,int(height)//2)


width: float = float(input("width: "))

height: float = float(input("height: "))

turtle.setup(width,height)
turtle.title("Example p2")
p2 = PenType2()
print(p2)
print("\n")
time.sleep(10000/1000)
p2.down()
p2.forward(10)
p2.right(144.0)
p2.forward(10)
p2.right(144.0)
p2.forward(10)
p2.right(144.0)
p2.forward(10)
p2.right(144.0)
p2.forward(10)

turtle.done()
