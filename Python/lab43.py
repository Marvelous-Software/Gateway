# John Maher
# Gateway - Python
# Henry Long
# Lab 4.3
# 9/16/2020


def skip_integers(*args):

    for arg in args: 
        if type(arg) == int:
            continue
        print(arg)

skip_integers(3, 5.2, "value", 6.0)
