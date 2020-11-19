# John Maher
# Gateway - Python
# Henry Long
# Lab 6.1B
# 11/4/2020

def word_counter(word):

    count = {}

    for letter in word :
        if letter != " " :
            if letter in count :
                count[letter] += 1
            else :
                count[letter] = 1

    return count

print(word_counter("Mississippi"))
