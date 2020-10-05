# John Maher
# Gateway - Python
# Henry Long
# Lab 3.9
# 9/16/2020


for num in range(10, 100): 
    if num == 0:
        pass
    elif num == 95:
        break
    elif type(num) != int:
        continue
    if num % 5 == 0:
        print(num)
    elif num % 5 != 0:
        continue
    else:
        pass
