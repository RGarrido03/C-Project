from abc import ABC, abstractmethod


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


class PenDoAndre(Pen):
    def __init__(self) -> None:
        super().__init__()
        self.color = "green"
        self.thickness = 2
        self.position = (0, 0)
        self.orientation = 0

    def another_methods(self):
        pass


class PenDoRuben(Pen):
    def __init__(self) -> None:
        super().__init__()
        self.color = "red"
        self.thickness = 3
        self.position = (0, 0)
        self.orientation = 0

    def another_methods(self):
        pass


# do things with pens
...
