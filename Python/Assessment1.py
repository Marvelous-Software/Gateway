# John Maher
# Gateway - Python
# Henry Long
# Assessment 1
# 8/27/2020

import math

def convert_kg(value):
    pounds = value * 2.20462
    ounces = value * 35.274
#    print(str(value) + " kg converted is" + str(pounds) + "pounds and " + str(ounces) + " ounces.")
    print(value, "kg converted is", pounds, "pounds and", ounces, "ounces.")

def convert_pounds(value):
    kg = value / 2.20462
    kg = value * 0.453592
    ounces = value * 16
#    print(str(value) + " pounds converted is " + str(kg) + " kg and " + str(ounces) + " ounces.")
    print(value, "pounds converted is", kg, "kg and", ounces, "ounces.")

def convert_ounces(value):
    kg = value / 35.274
    kg = value * .0283
    pounds = value / 16
    pounds = value * .0625
#    print(str(value) + " ounces converted is " + str(kg) + " kg and " + str(pounds) + " pounds.")
    print(value, "ounces converted is", kg, "kg and", pounds, "pounds.")


# __name__ == "__main__"

# if __name__ == "__main__":
print(convert_kg(3))
print(convert_pounds(3))
print(convert_ounces(3))
print('*' * 40)
print(convert_kg(7))
print(convert_pounds(7))
print(convert_ounces(7))
print('*' * 40)
print(convert_kg(10))
print(convert_pounds(10))
print(convert_ounces(10))
	