# John Maher
# Gateway - Python
# Henry Long
# Lab 6.5
# 11/4/2020


def unite_lists(list1, list2) :

    list_combined = []

    for item in list1 :
        list_combined.append(item)

    for item in list2 :
        if item not in list_combined :
            list_combined.append(item)
    
    # OR
    # for item in list2 + list2:
    #    if item not in list_combined :
    #        list_combined.append(item)

    return list_combined

print(unite_lists([2,4,6,8],[3,6,9,12]))
