
# main.py
import threading
from lib import Pen, Canvas
import turtle
import time

# Create a canvas
canvas = Canvas("Drawing with Two Pens", (800, 600), "white")

# Create two pens
pen1 = Pen()
pen2 = Pen()

# Customize the pens
pen1.set_color("red")
pen2.set_color("green")

# Set initial positions
pen1.set_position((-100, 0))
pen2.set_position((100, 0))

# Define the function to draw with pen1
def draw_with_pen1():
    for _ in range(36):
        pen1.down()
        pen1.forward(10)
        pen1.left(10)
        turtle.update()
        time.sleep(0.1)  # Small delay to make drawing visible

# Define the function to draw with pen2
def draw_with_pen2():
    for _ in range(36):
        pen2.down()
        pen2.forward(10)
        pen2.right(10)
        turtle.update()
        time.sleep(0.1)  # Small delay to make drawing visible


# Create threads for each pen
thread1 = threading.Thread(target=draw_with_pen1)
thread2 = threading.Thread(target=draw_with_pen2)

# Start the threads
thread1.start()
thread2.start()

turtle.mainloop()

# Wait for the threads to finish
thread1.join()
thread2.join()

# Keep the window open
turtle.done()