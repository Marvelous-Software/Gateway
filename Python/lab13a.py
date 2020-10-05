## John Maher
# Gateway - Python
# Henry Long
# Lab 13A
# 8/27/2020

distance = 60 # miles
time = 3 # hours

knotsInDistance = distance / 1.15078
feetInDistance = distance * 5280
secondsInTime = time * 3600

mph = distance / time
knots = knotsInDistance / time
fps = feetInDistance / secondsInTime
fps = (distance * 5280) / (time * 360) # fails automated check

print("The speed in knots is: " + str(knots))
print("The speed in miles per hour is: " + str(mph))
print("The speed in feet per second is: " + str(fps))
