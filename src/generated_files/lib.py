import turtle
from abc import ABC
import math


class Pen(ABC):
    def __init__(self) -> None:
        self.color = "blue"
        self.thickness = 1
        self.position = (0, 0)
        self.orientation = 0
        self.pressure = -1  # -1 means up
        self.isUp:bool=0
        self.turtle = turtle.Turtle()
        self.set_state()

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
        #TODO heading gives me deg so i dont need to parse it
        self.orientation = math.degrees(self.turtle.heading())

    def right(self, degrees: float) -> None:
        self.turtle.right(degrees)
        self.orientation = math.degrees(self.turtle.heading())

    def down(self) -> None:
        self.isUp = False
        self.turtle.pendown()

    def up(self) -> None:
        self.isUp  =True
        self.turtle.penup()

    def update_position(self) -> None:
        self.position = self.turtle.position()

    def set_state(self):
        self.turtle.color(self.color)
        self.turtle.penup()
        self.turtle.setpos(self.position)
        self.turtle.setheading(self.orientation)
        if self.pressure >= 0 and not self.isUp:
            self.turtle.pensize(self.thickness * self.pressure)
            self.turtle.pendown()
