from abc import ABC, abstractmethod
import time


class Pen(ABC):
    @abstractmethod
    def __init__(self) -> None:
        # defaults
        self.color = "blue"
        self.thickness = 1
        self.position = (0, 0)
        self.orientation = 0

    @abstractmethod
    def another_methods(self): ...


def main():
    myRealVar: float = 1.0
    myIntVar: int = 1
    myIntVar2: int = 8
    myIntVar3: int = myIntVar2
    myStringVar: str = "Hello"
    myBoolVar: bool = 
    myRealVar = 2.0
    myStringVar2: str = input("Enter a string: ")
    myStringVar2 = input("Enter another string: ")
    myStringVar2 = input("Enter another string: ")


if __name__ == "__main__":
    main()
