from threading import Timer
import turtle
import winsound



#import os
#os.system("start Ta-Da.mp3")


def drawSquare(t, x, y):  
  t.goto(x,y)
  t.forward(50)
  t.right(90)
  t.forward(50)
  t.right(90)
  t.forward(50)
  t.right(90)
  t.forward(50)
  t.right(90)

def drawTriangle(t, x, y):
  t.goto(x,y)
  t.right(64)
  t.forward(56)
  t.right(116)
  t.forward(48)
  t.right(116)
  t.forward(56)
  
def draw(t):
  t.forward(50)
  t.right(90)
  t.forward(50)
  t.right(90)
  t.forward(50)
  t.right(90)
  t.forward(50)
  t.right(90)
  t.forward(25)
  t.begin_fill()
  t.right(64)
  t.forward(56)
  t.right(116)
  t.forward(48)
  t.right(116)
  t.forward(56)
  t.end_fill()

def playWinSound():
  # Source of sound effect: https://www.youtube.com/watch?v=dAVzcGcVecU\
  winsound.PlaySound('Ta-Da.wav', winsound.SND_FILENAME)

def hello():    
    ht = turtle.Turtle()
    ht.write("hello, world", font=("Verdana", 18, "bold"))
    print("hello, world")


def find_click(x, y): 
    print(x, " ", y)
    if  -350 <= x <= -265 and 250 <= y <= 270:
        draw(42)
    elif -350 <= x <= -222 and 210 <= y <= 233:
        draw("hello")
    elif -350 <= x <= -250 and 170 <= y <= 190:
        draw(3.14)

#threading.Timer(interval, function, args = None, kwargs = None) 
#tt = Timer(interval=.25, function=hello)
#tt.start()


s = turtle.getscreen()
s.setup(1.0, 1.0)
s.setup(800, 600)
t = turtle.Turtle()
#name = input("Who are you: ")                # cmd
#name = s.textinput("NAME", "Who are you: ")  # window
#t.write("hello " + name, font=("Verdana", 18, "bold"))

t.speed(0)
t.hideturtle()
s.title("Turtle Demonstration") #AttributeError: 'Turtle' object has no attribute 'title'
for r in range(1, 10):
  drawSquare(t, (r * 10), (r * 10))
  t.clear()


c = turtle.Turtle()

c.fillcolor("red")
c.circle(60)
c.home
c.dot(20)

s.bgcolor("blue")
c.pensize(2)

draw(c)
  
c.penup()
c.goto(-100,-100)
c.pendown()
c.pencolor("red")
s.bgcolor("yellow")
c.fillcolor("blue")

draw(c)

c.penup()
c.goto(-60,-220)
c.pendown()
c.pencolor("blue")
s.bgcolor("green")
c.fillcolor("yellow")

draw(c)

c.write("Whats up?", font=("Verdana", 18, "bold"))

s.onscreenclick( find_click )

#s.onkey(nextFSMstate, "space")
#s.listen()

s.mainloop()

