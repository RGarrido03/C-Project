from abc import ABC, abstractmethod
import time
import sys
import turtle
import math
from lib import Pen

class DefaultPen(Pen):
    def __init__(self) -> None:
        super().__init__()


Canvas1__ = Canvas((100,100))
Canvas2__ = Canvas()
Canvas2__.set_background("red")

turtle.done()
