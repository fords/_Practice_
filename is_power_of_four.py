"""Write a method to determine whether a given integer (zero or positive number) is a power of 4 without using the multiply or divide operator. If it is, return True, else return False."""
def is_power_of_four(number):
    counter = 0 
    if (number is not None) and not ( number & (number-1) ):
        while number != 1:
            number = number / 2
            counter += 1
            
        return counter % 2 == 0  # There is only one bit set and number of zero bits is even
    return False