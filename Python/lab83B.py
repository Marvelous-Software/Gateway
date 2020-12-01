# John Maher
# Gateway - Python
# Henry Long
# Lab 8.3 B
# 11/30/2020

def resources_scanner(package):

    ls = dir(package)

    for item in ls:
        print(item)
    return

if __name__ == '__main__':
    import string 
    resources_scanner(string)
