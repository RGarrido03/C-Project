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


class PenType1(Pen):
    def __init__(self) -> None:
        super().__init__()
        self.color = "green"
        self.position = (10, 10)
        self.orientation = 0.7853981633974483
        self.thickness = 10
        self.pressure = -1


def main():
    p1 = PenType1()
    p1.down()
    p1.forward()
    p1.left()
    p1.forward()
    p1.left()
    p1.forward()
    p1.left()
    p1.forward()
    p1.left()
    psec = DefaultPen()
    turtle.done()


if __name__ == "__main__":
    main()
