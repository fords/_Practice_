# Write a method that returns its argument converted to a string.
def my_to_s(arg)
  # your code goes here
  arg.to_s
end

# Write a method that returns its argument rounded to the nearest integer.
def my_round(num)
  # your code goes here
  return num.round
end

# Write a method that returns the remainder of its two arguments.
# You may use the modulo operator.
def my_modulo(dividend, divisor)
  # your code goes here
  return dividend%divisor
end

# Write a method that returns the least common multiple of its two arguments.
# You may use the lcm method.
def my_lcm(int_one, int_two)
  # your code goes here
  int_one.lcm(int_two)
end

# Write a method that returns its argument converted to a float then 
# converted to a string.
def to_stringified_float(int)
  # your code goes here
  float = int.to_f
  return float.to_s
end

# Write a method that returns the sum of the absolute values of its arguments.
def absolute_sum(num_one, num_two)
  # your code goes here
  return num_one.abs + num_two.abs
end

# Write a method that returns the negative value of its argument.
# If the argument is negative, the method simply returns the argument.
# (negative(-1) => -1, negative(1) => -1, negative(0) => 0)
# HINT: use the abs method
def negative(num)
  # your code goes here
  return num.abs * -1
end


# MEDIUM

# Write a method that returns the last digit of its argument.
# Assume the argument is an integer.
# HINT: What is the return value of 142 % 10? How about 2 % 10?
def last_digit(int)
  # your code goes here
  return int%10
end

# Write a method that returns a boolean indicating whether 
# the last digit of the method's argument is odd.
# Assume the argument is an integer.
# Bonus points if you use last_digit as a helper method.
def last_digit_odd?(int)
  # your code goes here
  return int%2 == 1
end

# Write a method that returns the greatest common divisor of the last 
# digit of each of its arguments. Assume the arguments are integers.
# (gcd_of_last_digits(93, 9) = 3.gcd(9) => 3)
# Bonus points if you use last_digit as a helper method.
def gcd_of_last_digits(int_one, int_two)
  # your code goes here
  int_one.gcd(int_two)
end

# Write a method that returns the last n digits of its first argument,
# where n is the second argument.
# Assume both arguments are non-zero integers.
# (last_n_digits(1234, 2) => 34)
# HINT: What is the return value of 1234 % 100? How about 4 % 100?
def last_n_digits(num, n)
  # your code goes here
  return num% 10**n
end


#HARD

# Write a method that returns the decimal remainder of dividing two floats.
# The decimal remainder is the right side of the decimal point 
# (the "fractional part") of the quotient.
# (dec_remainder_of_two_floats(8.0, 5.0) => 0.6 because 8.0 / 5.0 => 1.6)
def dec_remainder_of_two_floats(f_dividend, f_divisor)
  # your code goes here
  quotient = f_dividend/f_divisor 
  return quotient - quotient.floor
end

# Write a method that returns the decimal remainder of dividing two integers.
# HINT: Use dec_remainder_of_two_floats as a helper method,
# but don't forget to pass the proper type of argument
def dec_remainder_of_two_integers(i_dividend, i_divisor)
  # your code goes here
    f_dividend = i_dividend.to_f 
  f_divisor = i_divisor.to_f 
  dec_remainder_of_two_floats(f_dividend, f_divisor)
end


# EXPERT

# Write a method that returns the integer remainder of its two arguments. 
# (i.e., what using the modulo operator would return).
# You may not use the modulo operator.
# Assume the arguments are integers.
# HINT: Use dec_remainder_of_two_integers as a helper method
def int_remainder_without_modulo(i_dividend, i_divisor)
  # your code goes here
   d_remainder = dec_remainder_of_two_integers(i_dividend, i_divisor) 
 f_remainder = d_remainder * i_divisor 
 f_remainder.round 
end

require_relative "test.rb"