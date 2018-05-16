# Three Digit Format

# Define a method, #three_digit_format(n), that accepts an integer, n, as an
# argument. Assume that n < 1000. Your method should return a string version of
# n, but with leading zeros such that the string is always 3 characters long.

def three_digit_format(n)
  # your code here
  if n < 1000
    n_str = n.to_s 
    if n_str.length == 1 
      n_str = "00"+n_str
    end
    if n_str.length == 2 
      n_str =  '0'+n_str
    end
    return n_str 
  end
end

puts "------Three Digit Format------"
puts three_digit_format(100) == "100"
puts three_digit_format(15) == "015"
puts three_digit_format(6) == "006"
