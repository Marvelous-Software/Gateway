# John Maher
# Gateway - Python
# Henry Long
# Lab 5.2
# 9/30/2020

# Initialize a tuple
cars = ('coupe', 'coupe', 'coupe', 'carbiolet', 'sedan')

# Use a tuple method to count the number of times the coupe element appears in the tuple cars, and assign it to a variable, fav.
fav = cars.count("coupe")
print("coupe appears", fav, "times")

# Use a tuple method to calculate the length of the tuple cars, and assign it to a variable, amt.
amt = len(cars)
print("cars has", amt, "elements")

# If the number of times the coupe element appears in the tuple cars is more than 45%, print Too many coupes in the garage. to the terminal. If not, print You are all set with cars. to the terminal.
if (fav / amt > .45):
    print("Too many coupes in the garage.")
else:
    print("You are all set with cars.")
