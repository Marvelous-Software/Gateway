# John Maher
# Gateway - Python
# Henry Long
# Assessment 9
# 12/16/2020

class EmailNotValidError(Exception):

    def __init__(self):
        self.message = "Target email is invalid"



def is_email_valid(mailing_list):
    
    for email in mailing_list: # Loop through the mailing list:

        if '@' not in email: # Check if the email contains an @:

            raise EmailNotValidError # Raise an EmailNotValidError exception if the @ is not present



def is_email_valid_extended(mailing_list):

    final_users_list = [] # Array to hold user ids

    # Inserted a try.., except.. block to cast the exception
    try:

        # Loop through the mailing list
        for key, email in final_users_list: # Your mailing list:


            if '@' in email: # Check if the @ is present in the email:

                # Append the id of users with valid emails
                final_users_list.append(key)

        else:

            raise EmailNotValidError # Raises an EmailNotValidError otherwise


    except EmailNotValidError: # Your user-defined exception:

        return "Target email is invalid" # Return a user-friendly message to cast the exception



def is_email_valid_extended_finally(mailing_list):

    final_users_list = [] # Array to hold user ids

    # Inserted a try.., except.. block to cast the exception
    try:
        # Loop through the mailing list
        for key, email in mailing_list: # Your mailing list:


            if '@' in email: # Check if the @ is present in the email:

                # Append the id of users with valid emails
                final_users_list.append(key)

        else:

            print("Target email is invalid")
            raise EmailNotValidError # Raises an EmailNotValidError otherwise

    except EmailNotValidError: # Your user-defined exception:

        # Print a user-friendly message to cast the exception
        print("Target email is invalid")

    finally:

        return final_users_list # Return the id of the users with valid email
