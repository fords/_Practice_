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
      #print div.to_s
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
  while i < 101 
    result.append(i+1) if arr[i+1] == true 
    i += 1 
  end 
  return result 
  
end

puts "------Cats in Hats------"
puts cats_in_hats == [1, 4, 9, 16, 25, 36, 49, 64, 81, 100]
