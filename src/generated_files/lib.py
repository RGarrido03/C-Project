import turtle
from abc import ABC

class Pen(ABC):
    def __init__(self) -> None:
        self.color = "blue"
        self.thickness = 1
        self.position = (0, 0)
        self.orientation = 0
        self.pressure = -1  # -1 means up
        self.isUp:bool=0
        self.turtle = turtle.Turtle()
        self.initTurtle()

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
        self.orientation = self.turtle.heading()

    def right(self, degrees: float) -> None:
        self.turtle.right(degrees)
        self.orientation = self.turtle.heading()

    def down(self) -> None:
        if self.pressure<0:
            self.pressure=1
            self.turtle.pensize(self.thickness * self.pressure)

        self.turtle.pendown()

    def up(self) -> None:
        self.turtle.penup()

    def update_position(self) -> None:
        self.position = self.turtle.position()

    def initTurtle(self):
        self.turtle.color(self.color)
        self.turtle.penup()
        self.turtle.setpos(self.position)
        self.turtle.setheading(self.orientation)

        if self.pressure >= 0:
            self.turtle.pensize(self.thickness * self.pressure)
            self.turtle.pendown()


    def set_color(self, color: str) -> None:
        self.color = color
        self.turtle.color(color)
    
    def set_thickness(self, thickness: float) -> None:
        self.thickness = thickness
        self.turtle.pensize(thickness * self.pressure)
    
    def set_position(self, t:tuple) -> None:
        self.position = t
        self.turtle.setpos(t)
    
    def set_orientation(self, degrees: float) -> None:
        self.orientation = degrees
        self.turtle.setheading(degrees)
    
    def set_pressure(self, pressure: float) -> None:
        self.pressure = pressure
        if self.pressure > 1:
            self.pressure = 1

        if self.pressure >= 0:
            self.turtle.pensize(self.thickness * pressure)
        else:
            self.up()
    
    def __repr__(self) -> str:
        return f"Pen(color={self.color}, thickness={self.thickness}, position={self.position}, orientation={self.orientation}, pressure={self.pressure})"
    
    def __str__(self) -> str:
        return f"Pen(color={self.color}, thickness={self.thickness}, position={self.position}, orientation={self.orientation}, pressure={self.pressure})"
