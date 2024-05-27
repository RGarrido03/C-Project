from abc import ABC, abstractmethod
import turtle
import math
import tkinter as tk
from tkinter import simpledialog


class Pen(ABC):
    def __init__(self) -> None:
        self.color = "blue"
        self.thickness = 1
        self.position = (0, 0)
        self.orientation = 0
        self.pressure = -1  # -1 means up
        self.turtle = turtle.Turtle()

    @abstractmethod
    def draw(self):
        pass

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


class PenType2(Pen):
    def __init__(self, width: int, height: int) -> None:
        super().__init__()
        self.color = "blue"
        self.position = (width // 2, height // 2)
        self.set_state()

    def draw(self):
        print(f"Drawing with PenType2 at {self.position} with color {self.color}")


def main():
    # Ask for width and height using tkinter

    # Set up the canvas
    turtle.setup(1500, 1500)
    turtle.title("Example p2")

    # Create and configure the pens
    pen1 = PenType2(int(1000), int(1000))
    pen2 = PenType2(int(1000), int(1000))
    pen1.color = "green"
    pen2.color = "red"

    # Draw with pen1
    pen1.down()
    pen2.set_state()
    pen2.down()
    for _ in range(5):
        pen1.forward(100)
        pen1.right(144)
        pen2.forward(50)
        pen2.right(144)

    # Draw with pen2

    # Output pen information
    print(
        f"Pen1 information: color={pen1.color}, position={pen1.position}, orientation={pen1.orientation}"
    )
    print(
        f"Pen2 information: color={pen2.color}, position={pen2.position}, orientation={pen2.orientation}"
    )

    # Keep the window open
    turtle.done()


if __name__ == "__main__":
    main()
