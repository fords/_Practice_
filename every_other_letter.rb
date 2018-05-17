# Every Other Letter

# Define a method, #every_other_letter(string), that accepts a string as an argument.
# This method should return a new string that contains every other letter of the
# original string, starting with the first character. Treat white-space
# and punctuation the same as letters.

def every_other_letter(string)
  # your code here
  max = string.length  
  str = ''
  i = 0
  loop do
    
    if (i == max)
      return str
      #break
    end
    if (i%2 == 0)
      str = str + string[i]
      #puts str
    end
    i += 1
  end
  #return str
end

puts "------Every Other Letter------"
puts every_other_letter("abcde") == "ace"
puts every_other_letter("i heart ruby") == "ihatrb"
puts every_other_letter("an apple a day...") == "a pl  a.."



# Wild Sum

# Define a method, #wild_sum(n) that sums all the numbers less than n that are:
#   - Divisible by 2 or divisible by 3
#   - Not divisible by both 2 and 3

# ex: wild_sum(16) ==> 2 + 3 + 4 + 8 + 9 + 10 + 14 + 15 ==> 65

def wild_sum(n)
  # your code here
  sum = 0
  while n > 2 
    n = n - 1
    if (n % 2 == 0) && (n % 6 != 0)
        sum += n
    elsif n % 3 == 0 && (n % 6 != 0)
        sum += n 
    end
  end
  return sum
  
end

puts "------Wild Sum------"
puts wild_sum(0) == 0
puts wild_sum(2) == 0
puts wild_sum(3) == 2
puts wild_sum(7) == 9



