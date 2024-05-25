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

    def __str__(self) -> str: ...


# <class>


def main():

    i: float = 0.0

    s: str = "TESTE"

    b: bool = True


if __name__ == "__main__":
    main()
