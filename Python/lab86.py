# John Maher
# Gateway - Python
# Henry Long
# Lab 8.3 C
# 11/30/2020


import random

def number_randomizer(number):

    nums = []

    for r in range(number):
        nums.append(random.randint(1, 100))

    return nums



print(number_randomizer(2)) 
print(number_randomizer(4))
print(number_randomizer(6))
