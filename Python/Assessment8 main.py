# John Maher
# Gateway - Python
# Henry Long
# Assessment 8
# 12/6/2020

#from update_mailing_list import update_mailing_list
from modules_package_file import mailinglist_validation_util
import modules_package_file as mlu

def mailing_list_utils():
     
    print("mailing_list_utils")
    return mailinglist_validation_util("mailing_list.csv", "output.csv", 1)


if __name__ == '__main__':

    # Calling the function from your package
    #print('The output file has length {}.'.format(mailing_list_utils_extended()))
    print('The output file has length {}.'.format(mailing_list_utils()))

    #mailinglist_validation_util
   
