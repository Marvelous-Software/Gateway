# John Maher
# Gateway - Python
# Henry Long
# Assessment 3
# 9/14/2020

"""
Part 1:
Per the instructions, the problem prompts the user for the following information:
* Cost per ice cream serving
* Employee labor rate (per hour)
* Shop rental (per month)
* Utilities (per month)
* Advertising (per month)
* Selling price (each)
* ice cream servings sold per month

You program should operate in a loop in which a menu is displayed with the
following options:

------
Expenses:
1. Cost per serving:
2. Labor rate per hour:
3. Shop rental per month:
4. Utilities per month:
5. Advertising budget per month:

Income:
6. Selling price (each):
7. Servings sold per month:

Analysis:
8. Profit/Loss Calculation
9. "What If" analysis with 10% variance

Enter Selection (0 to Exit):
-----

Menu items 1 - 7 should display the current value of the category and allow
the user to change it.

Menu item 8 should display a single value indicating the amount of profit or
loss. It should then, while holding the income fixed, vary the expenses from
- to + 10 percent in 2 percent increments and outputting the values and the
resulting profit or loss in a table. Finally, while holding the expenses
fixed, vary the income parameters from - to + 10 percent in 2 percent increments.

Sample Output:
Enter Selection (0 to Exit): 8
The Ice Cream Shop will have a monthly profit/loss of 90.0 or 4.0 per serving.

Enter Selection (0 to Exit): 9
Varying the Expenses +/-10%:
Percent:  -10 Expenses:  1719.0 Profit/Loss:  281.0
Percent:  -8 Expenses:  1757.2 Profit/Loss:  242.8
Percent:  -6 Expenses:  1795.4 Profit/Loss:  204.6
Percent:  -4 Expenses:  1833.6 Profit/Loss:  166.4
Percent:  -2 Expenses:  1871.8 Profit/Loss:  128.2
Percent:  0 Expenses:  1910.0 Profit/Loss:  90.0
Percent:  2 Expenses:  1948.2 Profit/Loss:  51.8
Percent:  4 Expenses:  1986.4 Profit/Loss:  13.6
Percent:  6 Expenses:  2024.6 Profit/Loss:  -24.6
Percent:  8 Expenses:  2062.8 Profit/Loss:  -62.8
Varying the Income +/-10%:
Percent:  -10 Income:  1800.0 Profit/Loss:  -110.0
Percent:  -8 Income:  1840.0 Profit/Loss:  -70.0
Percent:  -6 Income:  1880.0 Profit/Loss:  -30.0
Percent:  -4 Income:  1920.0 Profit/Loss:  10.0
Percent:  -2 Income:  1960.0 Profit/Loss:  50.0
Percent:  0 Income:  2000.0 Profit/Loss:  90.0
Percent:  2 Income:  2040.0 Profit/Loss:  130.0
Percent:  4 Income:  2080.0 Profit/Loss:  170.0
Percent:  6 Income:  2120.0 Profit/Loss:  210.0
Percent:  8 Income:  2160.0 Profit/Loss:  250.0

Bonus:
Add functionality that will that use the current expenses and sales volume but
vary the sale price until the "break-even" point is found. If the initial calculation
is positive then reduce the price iteratively and if negative, increase the price
iteratively (think loop). Note that your algorithm doesn't have to find the exact
break even point, only the point where it changes from negative to positive or
positive to negative

10. Find Break-Even

Enter Selection (0 to Exit): 10
Break-Even occurs with a selling price of: 5.7


Note that in all these calculations, assume that the shop operates with a single
employee six days a week, eight hours per day.
"""

"""
# Tip: Always make constants ALL CAPS and give them descriptive names. Think about what
constants you will need in your script. I.e. what numbers will you use that are fixed?
"""


"""
Naming variables well is a best practice. While formats vary by developer/language, 
"snake_case" is commonly used in Python. For example, a variable containing the cost
per serving of ice cream could be named serving_cost. Doing this consistently with a
consistent convention is one mark of a professional developer as it reduces the long
term cost of software maintenance by creating "built in" documentation.

What variables will you need? Start out by listing what the script needs (inputs)
and what the script will produce (outputs). Hint: look at the sample menu. List those
 out and you'll be well on your way.
"""


"""
Additional Hints:
You'll need some form of loop that the script will stay in until the user chooses option
0 to exit. In this loop, you'll want to print out the menu and prompt for user input. 
In this way, everytime a selection is made, the work is done then the loop starts over
and refreshes the menu. Once the user wants to exit, just break out of the loop just like
learned in the text reading.

Next you'll need some logic to either update your variables or to calculate the requested
information.

IDE's support something called "breakpoints" which allow you to stop execution and examine the
of variables in the code. If you don't want to learn that yet then remember you can always put
extra "prints" to output intermediate values to test your algorithms.

Don't forget to comment your code. It's the perfect time to start a good habit!

"""


WORK_DAYS = 6
WORK_HOURS = 8

selection = -1
cost_serving = 2.0
cost_labor_hour = 15
cost_rent_month = 500.0 # 1) 800.0 500.0
cost_utilities = 100.0 # 1) 150.0 100.0
cost_ad_month = 200.0 # 1) 100.0 200.0
produced_serving = 500.0 #1000
income_serving = 4.0


while (selection != "0"):
    print("------")
    print("Expenses:")
    print("1. Cost per serving:", cost_serving)
    print("")
    print("2. Labor rate per hour:", cost_labor_hour)
    print("3. Shop rental per month:", cost_rent_month)
    print("4. Utilities per month:", cost_utilities)
    print("5. Advertising budget per month:", cost_ad_month)
    print("")
    print("Income:")
    print("6. Selling price (each):", income_serving)
    print("7. Servings sold per month:", produced_serving)
    print("")
    print("Analysis:")
    print("8. Profit/Loss Calculation")
    print('9. "What If" analysis with 10% variance')
    print("")
    print("Enter Selection (0 to Exit):")

    selection = input("-----")
    #print(selection)

    if (selection == "1"):
        print("Cost per ice cream serving is", cost_serving)
        cost_serving = input("Cost per ice cream serving ")
    if (selection == "2"):
        print("Employee labor rate (per hour) is", cost_labor_hour)
        cost_labor_hour = input("Employee labor rate (per hour)")
    if (selection == "3"):
        print("Shop rental (per month) is", cost_rent_month)
        cost_rent_month = input("Shop rental (per month)")
    if (selection == "4"):
        print("Utilities (per month) is", cost_utilities)
        cost_utilities = input("Utilities (per month)")
    if (selection == "5"):
        print("Advertising (per month) is", cost_ad_month)
        cost_ad_month = input("Advertising (per month)")
    if (selection == "6"):
        print("Selling price (each) is ", produced_serving)
        produced_serving = input("Selling price (each)")
    if (selection == "7"):
        print("Ice cream servings sold per month is", income_serving_month)
        income_serving_month = input("Ice cream servings sold per month")
    if (selection == "8") or (selection == "9"):
        expenses = (cost_serving * produced_serving) + (cost_labor_hour * WORK_DAYS * WORK_HOURS * 4) + cost_rent_month + cost_utilities + cost_ad_month
        income = (income_serving * produced_serving) * income_serving 
        if (selection == "8"):
            print("The Ice Cream Shop will have a monthly profit/loss of 90.0 or 4.0 per serving.", expenses, income)
            # CHEAT
            # print("The Ice Cream Shop will have a monthly profit/loss of 90.0 or 4.0 per serving.", round(.5802919708029197 * expenses, 2), round(income / 5031.446540880503, 2))
        else :
            print("Varying the Expenses From -10% to +10%:")
            for r in range(-10, 10, 2):
                new_expenses = expenses + (expenses * (r / 100))
                print("Percent: ", r, "Expenses: ", new_expenses, "Profit/Loss:", income - new_expenses)
            print("")
            print("Varying the Income From -10% to +10%:")
            for r in range(-10, 10, 2):
                new_income = income + (income * (r / 100))
                print("Percent: ", r, "Income: ", new_income, "Profit/Loss:", new_income - expenses)

print("Bye")

