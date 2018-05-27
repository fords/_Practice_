
# Write a method that returns a boolean indicating whether an array is in sorted order. Use the equality operator (==), which returns a boolean indicating whether its operands are equal, e.g., 2 == 2 => true, ["cat", "dog"] == ["dog", "cat"] => false
def in_order?(arr)
  # if sort is allowed, one line code 
  max = arr.length 
  i = 0  
  loop do 
    break if (i == max - 1) 
    return false if (arr[i] >= arr[i+1])
    i = i + 1 
  end 
  return true 
end

# MEDIUM

# Write a method that returns the range of its argument (an array of integers).
def range(arr)
  arr = arr.sort 
  return arr[arr.length-1] - arr[0]
end