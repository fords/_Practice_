

def vowel_censor(string)
  arr =[ 'a','e','i','o' , 'u']
  new = ""
  string.each_char { |char| 
  if arr.include? char
    new = new + "X" 
  else 
    new = new + char
  end 
  }
  #return 
  new 
end

puts "---------Vowel Censor----------"
puts vowel_censor("Let's order a pizza") == "LXt's XrdXr X pXzzX"
puts vowel_censor("Nitwit, blubber, oddment, tweak") == "NXtwXt, blXbbXr, XddmXnt, twXXk"
puts vowel_censor("Supercalifragilisticexpialidocious") == "SXpXrcXlXfrXgXlXstXcXxpXXlXdXcXXXs"

# ----------------- Switch Roles!

def array_print_10
  arr = [0,1,2,3,4,5,6,7,8,9]
  i = 0 
  # loop do 
  #   break if i == 10 
  #   puts arr[i]
  #   i = i + 1
  # end 
  arr.each do |i|
    puts i
  end 
end
# Test your method by calling it! Type "array_print_10" below:
# YOUR TEST HERE
array_print_10
# Write a method, #range_print_10, that prints the numbers 0 - 9 using a range
# and the each method. Remember to test your method by calling it.

def range_print_10
  (0..9).step(1) do |n| 
    puts n 
  end 
  
end

#range_print_10 
# Write a method, #integer_print_10, that prints the numbers 0 - 9 using an integer
# and the times method. Remember to test your method by calling it.

def integer_print_10
  10.times do |x|
    puts x 
  end 
end

integer_print_10
