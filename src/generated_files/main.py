from abc import ABC, abstractmethod
import time
import sys
import turtle
import math
from lib import Pen

class DefaultPen(Pen):
    def __init__(self) -> None:
        super().__init__()


add__: int = 3 + 1
sub__: int = 3 - 1
mul__: int = 3 * 1
div__: float = 3 / 1
dre__: int = 3 // 1
pow__: int = 3 ^ 2
par__: int = (3 + 2) * 4
word__: str = "Bruno" + "Lopes"
turtle.done()