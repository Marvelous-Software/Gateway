# John Maher
# Gateway - Python
# Henry Long
# Lab 2.1B
# 9/2/2020

totaldays = int(input("Days you've been driving: "))

years = totaldays // 365
days = totaldays % 365
weeks = days // 7
days = days % 7

print("You've been driving for:")
print("Years:", years)
print("Weeks:", weeks)
print("Days:", days)
print(f"Years: {years}")
print(f"Weeks: {weeks}")
print(f"Days: {days}")

print()
print("-" * 40)
print()

years = totaldays // 365
days = totaldays % 365
months = days // 30
days = days % 30
weeks = days // 7
days = days % 7

print("You've been driving for:")
print(f"Years: {years}")
print(f"Months: {months}")
print(f"Weeks: {weeks}")
print(f"Days: {days}")
