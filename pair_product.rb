# Reverse Digits

# Define a method, #reverse_digits(int), that reverses the digits of its 
# argument and returns the resulting number.
def reverse_digits(int)
  a = int.to_s 
  a = a.split('')
  #a = a.sort 
  #puts a 
  i = a.length    
  res =''
  #if a [0] == a[1]
  loop do 
    
    #puts a[i]
    i = i - 1 
    break if i == -1 
    res  = res + a[i] 
    #puts res 
  end 
  res = res.to_i 
  #puts a 
  #b = a.to_i 
end

puts "-------Reverse Digits-------"
puts reverse_digits(1) == 1
puts reverse_digits(123) == 321
puts reverse_digits(1005) == 5001
puts reverse_digits(12345678) == 87654321

# ------------------------------------------------------------------------------

# Thirds Product

# Define a method, #thirds_product(array), that accepts an array of integers 
# as an argument. Your method should return the product of every third 
# element multiplied together. It should return 1 if there is no third 
# element.

# ex: thirds_product([0, 1, 2, 3, 4, 5, 6, 7, 8]) ==> 2 * 5 * 8 == 80

def thirds_product(array)
  return 1 if array.length < 3 
  i = 1 
  product = 1 
  loop do 
    break if i == array.length + 1 
    product = product * array[i-1] if i % 3 == 0 
    i += 1 
  end 
  return product 
end

puts "-------Thirds Product-------"
puts thirds_product([1, 2]) == 1
puts thirds_product([1, 2, 0]) == 0
puts thirds_product([0, 1, 2, 3, 4, 5]) == 10
puts thirds_product([1, 2, 5, 3, 4, 2, 6, 4, 2]) == 20

# ------------------------------------------------------------------------------

# How Many Likes?

# Define a method, #how_many_likes?(sentence) that accepts a string as an 
# argument. Your method should cound the number of times the sentence uses 
# the word "like".

def how_many_likes?(sentence)
  array = sentence.split(" ")
  sum = 0 
  i = 0 
  loop do 
    break if i == array.length 
    sum += 1 if array[i] == "like"
    i = i  + 1
  end 
  return sum 
end

puts "-------How Many Likes?-------"
puts how_many_likes?("this sentence is just fine") == 0
puts how_many_likes?("i really like ruby") == 1
puts how_many_likes?("i like really like how ruby works") == 2
puts how_many_likes?("this is like totally like too many like words") == 3

# ------------------------------------------------------------------------------

# Pair Product?

# Define a boolean method, #pair_product?, that accepts two arguments: an 
# array of integers and a target_product (an integer). The method returns a 
# boolean indicating whether any pair of elements in the array multiplied 
# together equals that product. You cannot multiply an element by itself. 
# An element on its own is not a product.

def pair_product?(arr, target_product)
  i = 0 
  j = 0 
  a = arr.pop
  #puts a 
  loop do 
    return false if i == arr.length 
    return true if a * arr[i] == target_product
    i = i + 1 
  #puts arr
  end 
  #loop do 
  #  return false if i == arr.length 
    
  #  a = arr[i]
  #  i = i + 1 
  #  arr2 
  #  loop do 
      
  #    return true if a * arr2[j] == target_product
  #    j = j+ 1
  #  end 
  #end
end

puts "-------Pair Product?-------"

puts pair_product?([5, 3, 4, 2], 6) == true
puts pair_product?([5, 3, 5], 10) == false
puts pair_product?([6, 1, 7, 8], 1) == false
puts pair_product?([2, 8, 6, 2], 4) == true

# ------------------------------------------------------------------------------
