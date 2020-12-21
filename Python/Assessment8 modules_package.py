# John Maher
# Gateway - Python
# Henry Long
# Assessment 8
# 12/6/2020

from update_mailing_list import update_mailing_list 
import csv


# Global variable to set the base path to our dataset folder
base_url = '../dataset/'


def read_mailing_list_file(filename, io_mode):

    # Open the file with the `with` context manager
    with open(the_url, io_mode) as csv_file:


        file_reader = csv.reader(csv_file, delimiter=',') # Open the csv file, passing the ',' delimiter, which is generally the case for csv files


        line_count = 0 # Declare a counter to control the number of lines from dataset (this is useful to skip the
        # header row and print only the data values)


        mailing_list = [] # Declare a list variable to hold the rows read from file

        # Looping through each row of the file
        for row in file_reader:

            if (line_count != 0):# Check if the line is not the header row:
                mailing_list.append(row) # Append each line to the `mailing_list` variable, excluding the header

            line_count += 1# Increment the variable in 1


    mailing_list_buffer = [] # Create another list variable that will be used as a temporary buffer to transform
    # our previous list into a dictionary, which is the data structure expected from the `update_mailing_list_extended`
    # function

    # Looping through the mailing list object
    for item in mailing_list:
        # Creating tuples with each row in the original list
        #data = (item[0], item[1], item[2], item[3])
        #mailing_list_buffer.append(data)
        mailing_list_buffer.append((item[0], item[1], item[2], item[3]))

    #mailing_dict = {} # Transforming the list of tuples into a python dictionary
    #Convert(mailing_list_buffer, mailing_dict)
    mailing_dict = dict(mailing_list_buffer)


    updated_mailing_list_ids = update_mailing_list(mailing_dict) # Call the `update_mailing_list_extended` from chapter 4 passing the mailing
    #  list dictionary

    return updated_mailing_list_ids # Return the resulting ids of the active users


def save_output_file(updated_mailing_list, output_filename, io_mode):

    # Open the output file with the `with` context manager
    #with open(base_url + output_filename, io_mode) as active_users_file:
    with open(output_filename, io_mode) as active_users_file:

        # Create a csv_writer object that will be responsible to persist the active users ids to a
        csv_writer = csv.writer(active_users_file, delimiter='\n', quotechar='"', quoting=csv.QUOTING_MINIMAL)
        # resulting csv file

        # Write each user id as a new row to the file
        #for item in mailing_list:
        #   csv_writer.writerow(item[0])
        #csv_writer.writerows(update_mailing_list)
        csv_writer.writerow(update_mailing_list)

def mailinglist_validation_util(filename, output_filename, io_mode):

    updated_mailing_list = read_mailing_list_file(filename, io_mode[0])# Call the function to read the original mailing list file
    #  and cache the results from the function

    # Call the function to write the results back to a csv file
    save_output_file(updated_mailing_list, output_filename, io_mode[1])

    #file = open(output_filename,"r") 
    output_file = open(output_filename) 
    #output_file = file.read() # Open output file to count the number of lines written

    # Compute the length of the output file
    #output_file_length = output_file.split("\n")
    output_file_length = sum(1 for _ in output_file)

    #file.close# Closing the output file
    output_file.close# Closing the output file

    return output_file_length # Return the output file length
