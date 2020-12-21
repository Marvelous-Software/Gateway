# John Maher
# Gateway - Python Turtle
# Mirco Speretta
# Conditionals
# 12/20/2020


import turtle
import winsound


def drawVariable(t, x, y, name, value=""):
  t.pensize(5)
  t.goto(x,y)
  t.forward(50)
  t.right(90)
  t.forward(50)
  t.right(90)
  t.forward(50)
  t.right(90)
  t.forward(50)
  t.right(90)

def drawBackground():
  b = turtle.Turtle()
  b.sety(25)
  b.write(turtle.screensize(), font=("Courier New", 18, "bold")) 
  b.fillcolor("red")
  #window_width()
  #window_height()

  
def drawGraph():
  g = turtle.Turtle()
  #turtleDefaults(g)
  #for y in range(10, 600, 10):
  for x in range(10, 800, 10):
    g.up()
    g.goto(0, x)
    g.down()
    g.fd(570)

def playWinSound():
  # Source of sound effect: https://www.youtube.com/watch?v=dAVzcGcVecU\
  winsound.PlaySound('Ta-Da.wav', winsound.SND_FILENAME)

def onClick(x, y): 
    print(x, " ", y)
    if  -350 <= x <= -265 and 250 <= y <= 270:
        draw(42)
    elif -350 <= x <= -222 and 210 <= y <= 233:
        draw("hello")
    elif -350 <= x <= -250 and 170 <= y <= 190:
        draw(3.14)

def turtleDefaults(t): 
  t.speed(0)
  t.hideturtle()


s = turtle.getscreen()
s.setup(820, 620) # 20 px for window sides
s.setworldcoordinates(0, 600, 800, 0)
s.mode('world') 
s.title("Conditionals Demonstration")
s.bgcolor("cyan")
  
t = turtle.Turtle()
turtleDefaults(t)

drawBackground()
drawGraph()


s.onscreenclick(onClick)

#s.onkey(nextFSMstate, "space")
#s.listen()

s.mainloop()

