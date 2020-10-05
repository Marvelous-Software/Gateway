# John Maher
# Gateway - Python
# Henry Long
# Assessment 2
# 9/13/2020

def validate_url(url):
    """Validates the given url passed as string.

    Arguments:
    url -- String, A valid url should be of form <Protocol>://<hostmain>/<fileinfo>
    """
    NOT_FOUND = -1

    rc = False
    valid_protocols = ["http:", "https:", "ftp:"]
    valid_fileinfo = ["html", "csv", "docx"] #, "jpg", "png", "gif"]


    urlParsed = url.lower().split("/")

    # Ensure we have enough elements
    if len(urlParsed) > 3:
        # Check protocol        
        if urlParsed[0] in valid_protocols:
            print("Protocol accepted")
            # Check for double forward slash                                
            if urlParsed[1] == "":
                print("Double slashes found")
                # Check for a file extension
                filename = urlParsed[len(urlParsed) - 1]
                extensionLoc = filename.find('.')                        
                if extensionLoc != NOT_FOUND:
                    print("File has an extension")
                    # Check file extension                            
                    if filename[extensionLoc + 1:] in valid_fileinfo:
                        rc = True

    return rc # return True if url is valid


if __name__ == '__main__':

    url = input("Enter an Url: ")
    print(validate_url(url))
	
