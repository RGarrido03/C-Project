from abc import ABC, abstractmethod
import time
import sys
import turtle
import math
from lib import Pen

class DefaultPen(Pen):
    def __init__(self) -> None:
        super().__init__()


class penTypeGrossa(Pen):
    def __init__(self) -> None:
        super().__init__()
        self.color = "green"
        self.position = (0,0)
        self.thickness = 5
        self.thickness = 7
        self.pressure = 6
        self.pressure = 10


pass

turtle.done()
