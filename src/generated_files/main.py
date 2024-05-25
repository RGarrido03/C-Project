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


class PenType1(Pen):
    def __init__(self) -> None:
        super().__init__()
        self.color = "green"
        self.position = (10,10)
        self.orientation = 45º

class PenType(Pen):
    def __init__(self) -> None:
        super().__init__()
        self.color = "red"
        self.position = (1,10)
        self.orientation = 45º



def main():

    i:float = 0.0

    s:str = "TESTE"

    s = "re assign"


if __name__ == "__main__":
    main()