# John Maher
# Gateway - Python
# Henry Long
# Lab 9.4
# 12/9/2020

class Error(Exception):

    def __init__(self, message):
        super().__init__(self.message)
        self.strerror = message
        self.error += message
        self.args = {message}    
    pass


try:
  print(1/0)
except:
  print("An exception occurred")

