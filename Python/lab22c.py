# John Maher
# Gateway - Python
# Henry Long
# Lab 2.2C
# 9/6/2020

text = input("Enter a string to search - ")
subtext = input("Enter the search text - ")
text = text.lower().strip()
occurances = text.count(subtext)
print("There are", occurances, "occurrences of '" + subtext + "' in the sentence")