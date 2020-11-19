# John Maher
# Gateway - Python
# Henry Long
# Lab 6.1C
# 11/4/2020


def content_combiner(source1, source2) :

    target = {}
    target.update(source1)
    target.update(source2)
    return target

print(content_combiner({"gold": "Yellow"}, {"karats": 24}))
