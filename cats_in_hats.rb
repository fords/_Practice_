
=begin 
You have 100 cats.
Your rules are simple: whenever you visit a cat, you toggle it's hat status (if it
already has a hat, you remove it.. if it does not have a hat, you put one on).
All of the cats start hat-less. You cycle through 100 rounds of visiting cats.
In the 1st round, you visit every cat. 
In the second round, you visit every other cat.
In the nth round, you visit every nth cat.. until the 100th round, in which you only
visit the 100th cat.
At the end of 100 rounds, which cats have hats?
=end

def cats_in_hats
  index = 1  
  arr =[]
  while index < 101 
    arr[index] = true 
    index += 1 
  end 
  #print arr
  #print "\n"
  index = 1
  div = 2 
  add_div = 2
  loop do 
    break if index == 101
      #toggle the value 
      while div < 101 
        if arr[div] == false 
          arr[div] = true 
        elsif arr[div] == true
          arr[div] = false 
        end
        div = div + add_div 
      end 

    #print arr 
    #print "\n"
    index += 1 
    div = index + 1
    add_div = div 
  end 
  result = []
  i = 0 
  while i < 101   # Remove offset and return the index value of cat wearing a hat
    result.append(i+1) if arr[i+1] == true 
    i += 1 
  end 
  return result 
  
end

puts "------Cats in Hats------"
puts cats_in_hats == [1, 4, 9, 16, 25, 36, 49, 64, 81, 100]
