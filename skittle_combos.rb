# Skittle Combos
# ----------------------------------------
# You have a bag of skittles. You want to know what every unique
# two-flavor combination tastes like. Write a method that takes in
# a bag of skittles and returns an array of every unique two-flavor
# combination that you could make from the bag, each in its own array.
# Each of the two-flavor arrays should be arranged alphabetically.


def skittle_combos(skittles)
  array = []
  skittles.each do |color1|
    skittles.each do |color2|
      if color1 == color2 
        next 
      end 
        result = [color1,color2].sort()
        array.append(result)
    end
  end
  return array 
end
puts "---------Skittle Combos----------"
puts (
  skittle_combos(["red", "orange", "green"]).include?(["orange", "red"]) &&
  skittle_combos(["red", "orange", "green"]).include?(["green", "red"]) &&
  skittle_combos(["red", "orange", "green"]).include?(["green", "orange"]))
puts (
  skittle_combos(["purple", "red", "yellow", "green", "red"]).include?(["purple", "red"]) &&
  skittle_combos(["purple", "red", "yellow", "green", "red"]).include?(["purple", "yellow"]) &&
  skittle_combos(["purple", "red", "yellow", "green", "red"]).include?(["green", "purple"]) &&
  skittle_combos(["purple", "red", "yellow", "green", "red"]).include?(["red", "yellow"]) &&
  skittle_combos(["purple", "red", "yellow", "green", "red"]).include?(["green", "red"]) &&
  skittle_combos(["purple", "red", "yellow", "green", "red"]).include?(["green", "yellow"]))
puts skittle_combos(["yellow", "yellow"]) == []