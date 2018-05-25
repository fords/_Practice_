# Multiply Me

# Define a method, #multiply_me(array, int), that accepts an array and an 
# integer as arguments. Your method should return a new array, with all of 
# the elements in the original array multiplied by the int.

def multiply_me(array, int)
  return [] if array.length == 0 
  index  = 0; result = []
  loop do 
    break if index == array.length
    result[index] = int * array[index]
    index += 1
  end
  return result 
end

puts "-------Multiply Me-------"
puts multiply_me([], 1) == []
puts multiply_me([1, 2, 3], 1) == [1, 2, 3]
puts multiply_me([2, 4, 6], 2) == [4, 8, 12]
puts multiply_me([2, 15, 100], 0) == [0, 0, 0]

# ------------------------------------------------------------------------------

# Max Range

# Define a method, #max_range(array), that accepts an array of integers as an
# argument. Your method should return the difference between the largest 
# integer and the smallest integer in the array. Assume the array always has 
# at least 2 elements.

# ex: max_range(1, 8, 4) ==> largest = 8, smallest = 1 ==> 8 - 1 ==> 7

def max_range(array)
  array = array.sort 
  return array[-1] - array[0]
end

puts "-------Max Range-------"
puts max_range([9, 7]) == 2
puts max_range([9, 7, 3, 8]) == 6
puts max_range([1, 1, 0, 0]) == 1
puts max_range([10, -15, 100, 30]) == 115

# ------------------------------------------------------------------------------

# Remove W Words

# Define a method, #remove_w_words(sentence), that accepts a string as an 
# argument. Your method should return a new string, omitting all the words 
# that start with "w"

def remove_w_words(sentence)
  array = sentence.split(" ")
  result = ''
  array.each { |x| str_array= x.split('') 
     if (str_array[0] != 'w')
        result = result +  x +' ' 
     end 
  } 
   result = result.rstrip
   #puts result 
   return result 
end

puts "-------Remove W Words-------"
puts remove_w_words("") == ""
puts remove_w_words("words") == ""
puts remove_w_words("throw it this way") == "throw it this"
puts remove_w_words("string with a whole lot of w words") == "string a lot of"

# ------------------------------------------------------------------------------

# Prime?

# Define a boolean method, #prime?(int), that accepts an integer as an 
# argument. Your method should return true / false, based on whether or not
# n is prime. Remember, a number is prime if it has no divisors other than 
# 1 and itself.

# ex: 15's divisors are: 1, 3, 5, 15 ==> 15 is not prime!
# ex: 20's divisors are: 1, 2, 4, 5, 10, 20 ==> 20 is not prime!
# ex: 17's divisors are: 1, 17 ==> 17 is prime!

def prime?(int)
  index = int  
  while  index > 1 
    return false if int % index == 0 and index != 2 and index != int
    index = index -1 
  end 
  return true 
end

puts "-------Prime?-------"
puts prime?(2) == true
puts prime?(16) == false
puts prime?(17) == true
puts prime?(101) == true

# ------------------------------------------------------------------------------
