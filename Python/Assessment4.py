# John Maher
# Gateway - Python
# Henry Long
# Assessment 4
# 9/16/2020

multiplier_amount = 1000000

def calculate_gains(amount_inv = 0.0):
    # Calculating the return gains of an investment.
    

    # base amount gain margin
    gain_margin = .1 #%
    total_gains = 0
    total_amount = 0

    if amount_inv > 1000:

        # check whether the invested amount is greater than the multiplier amount
        if amount_inv > multiplier_amount:
            # gather the value of the division
            # update the `gain_margin` by the multiplier mod
            total_gains += gain_margin * (amount_inv % multiplier_amount)
        else:
            total_gains = gain_margin
        
        # calculate the total amount of gains
        total_amount = gain_margin * amount_inv
        # calculate the total amount of gains
        total_amount += amount_inv

    # return the gains, the full amount and the gain margin
    return total_gains, total_amount, gain_margin


multiplier_amount = 1000000
print(calculate_gains(50000))
print(calculate_gains(20000000))
