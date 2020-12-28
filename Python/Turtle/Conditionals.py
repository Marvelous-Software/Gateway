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

def drawBackground(s):

# _________________________
# |  1  |        2        |
# |     |                 |
# |     |                 |
# |     |                 |
#
# Section 1 presents the value
# Section 2 displays the statement


  screenHeight = s.screensize()[1]
  screenWidth = s.screensize()[0]
  offsetx2ndSection = screenWidth * .25
  x2ndSectionWidth = screenWidth * .75
  y2ndSectionHeight = screenHeight * .75
  margin = screenWidth * .025
  corner = x2ndSectionWidth * .1

  b = turtle.Turtle()
  turtleDefaults(b)
  b.up()
  b.goto(offsetx2ndSection * .88, (margin + corner) * .8)
  b.fillcolor("wheat")
  b.pencolor("azure2")
  b.down()
  b.begin_fill()
  b.rt(90)
  b.circle(60, 90)
  b.fd(x2ndSectionWidth - corner * 2 - margin)  
  b.circle(60, 90)
  b.fd(y2ndSectionHeight - corner * 2 - margin)  
  b.circle(60, 90)
  b.fd(x2ndSectionWidth - corner * 2 - margin)  
  b.circle(60, 90)
  b.fd(y2ndSectionHeight - corner * 2 - margin)  
  b.circle(60, 90)
  b.end_fill()
  b.up()
  b.goto(offsetx2ndSection, margin + corner)
  b.fillcolor("black")
  b.pencolor("yellow")
  b.down()
  b.begin_fill()
  b.rt(90)
  b.circle(60, 90)
  b.fd((x2ndSectionWidth - corner * 2 - margin) * .9)
  b.circle(60, 90)
  b.fd((y2ndSectionHeight - corner * 2 - margin)   * .8)
  b.circle(60, 90)
  b.fd((x2ndSectionWidth - corner * 2 - margin) * .9)
  b.circle(60, 90)
  b.fd((y2ndSectionHeight - corner * 2 - margin) * .8)  
  b.circle(60, 90)
  b.end_fill()
  b.up()
  b.goto(offsetx2ndSection + (corner / 2), y2ndSectionHeight -  (corner / 2))
  b.pencolor("gray")
  #b.write(b.pos(), font=("Courier New", 18, "bold")) 
  b.write("Marv quad speed", font=("Times New Roman", 18)) 

  
def drawGraph(s):
  g = turtle.Turtle()
  s.tracer(0, 0)
  turtleDefaults(g)
  g.lt(90)
  for x in range(0, 800, 10):
    g.up()    
    g.goto(x, 0)
    g.down()
    g.fd(600)
  g.rt(90)
  for y in range(0, 600, 10):
    g.up()
    g.goto(0, y)
    g.down()
    g.fd(800)
  s.update()

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

drawBackground(s)
#drawGraph(s)


s.onscreenclick(onClick)

#s.onkey(nextFSMstate, "space")
#s.listen()

s.mainloop()

