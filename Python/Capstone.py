# John Maher
# Gateway - Python
# Henry Long
# Capstone
# 11/30/2020


import requests
import json


class AccessApi:
    """
    Class AccessApi is used to abstract lower level access to course required API

    Attributes
    ----------
    url : str
        A valid website used to hold the courses json filesS

    Methods
    -------
    url_active()
        returns True if the url is currently responding without errors, and False if not.

    get_end_point(endpoint)
        returns the json output of the GET request

    """
    #1
    def __init__(self, url):
        """
        Parameters
        ----------
        url: str
           a valid website forexample: http://google.com
        end_point: str
            a valid endpoint on a website  "api/sites/master.json"
        """
        self.url = url

    #2
    @property
    def url(self) -> str:
        return self.url
        
    #3
    @url.setter
    def url(self, url: str):
        self.url = url
        
    #4
    def url_active(self) -> bool:
       return requests.get(self.url).status_code == 200

    #5
    def get_end_point(self, end_point:str) -> dict:
        """
        Parameters
        ----------
        end_point: str
            a valid endpoint on a website  "api/sites/master.json"
        """
        response = requests.get(self.url + "/" + end_point)
        with open('response.json') as d:
            dictData = json.load(d)
        return dictData
        
    #6
    def get_status_code(self, end_point:str) -> int:
        """
        Parameters
        ----------
        end_point: str
            a valid endpoint on a website  "api/sites/master.json"
        """
        response = requests.get(self.url + "/" + end_point)
        return response.status_code

    #7
    def get_elapsed_time(self, end_point:str) -> float:
        """
        Parameters
        ----------
        end_point: str
            a valid endpoint on a website  "api/sites/master.json"
        """
        response = requests.get(self.url + "/" + end_point)
        return response.elapsed



