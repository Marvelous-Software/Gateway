# John Maher
# Gateway - Python
# Henry Long
# Lab 7.5
# 11/16/2020


class MoviePlayer:

    current_movie = ""

    firmware_version = 1.0

    def __init__(self):

        self.__movies = []
        self.__movies.append("Star Wars")
        self.__movies.append("Jaws")
        self.__movies.append("Its a mad mad mad mad mad world")

    def list_movies(self):

        return self.__movies

    def play(self):

        self.current_movie = self.__movies[0]

    def update_firmware(self, newfirmware):

        if newfirmware > self.firmware_version:
            self.firmware_version = newfirmware



# The code below is used to test your class
if __name__ == '__main__':
    player = MoviePlayer()
    print("Movies currently on device:", player.list_movies())

    player.update_firmware(2.0)
    print("Updated player firmware version to", player.firmware_version)

    player.play()
    print("Currently playing", f"'{player.current_movie}'")

