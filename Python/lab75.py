# John Maher
# Gateway - Python
# Henry Long
# Lab 7.6
# 11/23/2020


class Bird:
    def __init__(self, wingspan, lifespan, speed):
        self.wingspan = wingspan
        self.lifespan_in_years = lifespan
        self.speed_in_mph = speed

    def __str__(self):
        return f"The {type(self).__name__.lower()} "\
            f"has a wingspan up to {self.wingspan}ft,"\
            f" has a lifespan of {self.lifespan_in_years} years and "\
            f"can fly at a maximum speed of {self.speed_in_mph}mph."

class Eagle(Bird):

    clutch_size = 0

    def __init__(self, wingspan, lifespan, speed):
        self.wingspan = wingspan
        self.lifespan_in_years = lifespan
        self.speed_in_mph = speed
        self.clutch_size = 3

    def __str__(self):
        return f"The {type(self).__name__.lower()} "\
            f"has a wingspan up to {self.wingspan}ft,\n"\
            f" has a lifespan of {self.lifespan_in_years} years and \n"\
            f"can fly at a maximum speed of {self.speed_in_mph}mph\n"\
            f"with a clutch size of {self.clutch_size}."

# This code is used to test your class
if __name__ == '__main__':
    eagle = Eagle(7.5, 20, 99)
    print(eagle)
