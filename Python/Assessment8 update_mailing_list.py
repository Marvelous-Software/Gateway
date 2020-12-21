# John Maher
# Gateway - Python
# Henry Long
# Assessment 8
# 12/6/2020


#import mailinglist_validation_util from mailinglist_util

def update_mailing_list(mailing_list):

    # Checks it the flag `opt-out` is present. You can use lower() to lowercase the flags and contemplate both
    # `opt-out` and `OPT-OUT` cases
    # Then, checks for the presence of the `unsubscribed` flag Finally,
    # checks if the email address contains `@gmail` provider
    #mailing_list_copy = mailing_list.copy()
    mailing_list_copy = dict(mailing_list)
    for key, value in mailing_list_copy.items():

        # Your conditional logic to filter out the unsubscribed users
        print("key = " + key)
        flag = value[2].lower()
        #if (flag == "opt-out" or flag == "unsuscribed" or value[1].find("@gmail") < 0):
        if ("opt-out" in value[2].lower()) or \
             ("unsuscribed" in value[2].lower()) or \
             ("@gmail" in value[1].lower()):
        # Remove the key if one of the above conditions is satisfied
            #mailing_list_copy.Remove(key)
            mailing_list.pop(key)


    # An array to collect the final output
    ids = []

    # Loop through the updated mailing list and append the ids of the active users to the `id` list
    for key, value in mailing_list.items(): # Your updated dictionary:
    # Append only the ids of the active users
        #if (value[1].find("@gmail") < 0):
        ids.append(key)
    # Returns the updated mailing list with the active users
    return ids

