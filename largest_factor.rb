# Largest Factor
# ----------------------------------------
# Write a method, #largest_factor, that accepts an integer as an argument and returns
# the largest factor of that integer

def largest_factor(n)
  max = n  
  largest_factor = 0 
  i = 0 
  loop do 
    i = i + 1 
    break if i == max 
    if n % i == 0 
      largest_factor = i 
      #print max 
    end
    
  end
  return largest_factor 
end

puts "---------Muni Routes----------"
puts largest_factor(10) == 5
puts largest_factor(143) == 13
puts largest_factor(27) == 9
puts largest_factor(17) == 1

# Vowel Censor
# ----------------------------------------
# Write a method, #vowel_censor that takes in a string and replaces
# any vowels in it with an "X". Do not modify the original string.

def vowel_censor(string)
  str = string 
  str.each_char do |i|
    if i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u'
      str[i] = 'X' 
    end
  end
  return str
end

puts "---------Vowel Censor----------"
puts vowel_censor("let's order a pizza") == "lXt's XrdXr X pXzzX"
puts vowel_censor("nitwit, blubber, oddment, tweak") == "nXtwXt, blXbbXr, XddmXnt, twXXk"
puts vowel_censor("supercalifragilisticexpialidocious") == "sXpXrcXlXfrXgXlXstXcXxpXXlXdXcXXXs"



# ----------------- Switch Roles!





