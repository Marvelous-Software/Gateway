# John Maher
# Gateway - Python
# Henry Long
# Lab 3.3
# 9/14/2020

MESSAGE_FIRST = "Enter your password:"

message = MESSAGE_FIRST
password = ""


name = input('Enter your name:').lower()

while (password != "Pas$Word"):
    password = input(message)
    message = "Incorrect password, try again...\n" + MESSAGE_FIRST

print("Welcome back,", name)
