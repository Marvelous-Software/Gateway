# John Maher
# Gateway - Python
# Henry Long
# Lab 8.7
# 12/6/2020

import csv

pay_rate = []

with open('employees.csv') as infile:
    csv_reader = csv.reader(infile, delimiter=',')
    line_count = 0
    for row in csv_reader:
        if line_count == 0:
            pay_rate.append((row[0], "pay_rate"))
        else:
            pay_rate.append((row[0], "$" + str(int(row[1]) * 15)))
        line_count += 1

with open('wages.csv', 'w') as outfile:
    csv_writer = csv.writer(outfile)
    csv_writer.writerows(pay_rate)

print(f'Processed {line_count} lines.')
