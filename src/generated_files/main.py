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
    i: int = 5
    s: str = str(i)
    t: str = "5"
    t = str(8)
    r: float = 5.0
    r = float(1)
    r = float("1")
    import sys
    print(r, file=sys.stderr)


if __name__ == "__main__":
    main()
