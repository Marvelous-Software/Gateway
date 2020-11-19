# John Maher
# Gateway - Python
# Henry Long
# Lab 7.4
# 11/16/2020


class Package:

    def __init__(self, items):

        if items > 6:
            print(f"The limit has been exceeded by {items - 6}")
            self.items = items - 6
        else:
            print(f"There are {items} in the package")
            self.items = items



# This is to test your code
if __name__ == '__main__':
    morepackages = True
    while morepackages:
        items = int(input("How many items are in the package?: "))
        package = Package(items)
        yn = input('Ship more packages? Y/N ')
        morepackages = yn == 'y' or yn == 'Y'
