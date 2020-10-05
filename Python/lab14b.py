# Gateway - Python
# Henry Long
# Lab 14B
# 8/27/2020

'''Lab 1.4B'''
whole_num = int(input("Generate a multiplication table for:"))
print("_" * 10)
print("Number:" + str(whole_num))

for r in range(2,12,2):
  print(str(r) + ": " + str(r * whole_num))


print("_" * 10)
