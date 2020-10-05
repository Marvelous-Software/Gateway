# John Maher
# Gateway - Python
# Henry Long
# Lab 2.2B
# 9/2/2020

text = input("")
count = int(input("how many characters"))
text = text[:len(text) - count] + text[len(text) - count:].upper()
print(text)
