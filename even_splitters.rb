def even_splitters(string)
  result = []
  i = 0 
  while i < string.length 
    char = string[i]
    substrings = string.split(char)
    j = 0 
    same_length = true 
    while j < substrings.length - 1 #  compare items next to each other
      if substrings[j].length != substrings[j+1].length && substrings[j] != ""
        same_length = false 
      end 
      j += 1 
    end 
    if same_length && !result.include?(char)
      result << char 
    end 
    i += 1 
  end 
  
  return result
end

puts "-----Even Splitters----"
puts even_splitters("") == []
puts even_splitters("t") == ["t"]
puts even_splitters("jk") == ["j", "k"]
puts even_splitters("xoxo") == ["x", "o"]
puts even_splitters("banana") == ["b","a"]
puts even_splitters("mishmash") == ["m","h"]