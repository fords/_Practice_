# Two-Sum

# Define a method, #two_sum, that accepts an array and a target sum (integer) as arguments.
# The method should return true if any two integers in the array sum to the target.
# Otherwise, it should return false. Assume the array will only contain integers.

def two_sum(array, target)
  arr_a = array.pop()
  var = false 
  array.each { |x| 
    return true if arr_a + x == target
  }
  return false 
end

puts "------Two Sum------"
puts two_sum([1,2,3,4,5,6], 8) == true
puts two_sum([1,2,3,4,5,6], 18) == false
puts two_sum([1,3,6], 6) == false
puts two_sum([1,8,2,1], 0) == false