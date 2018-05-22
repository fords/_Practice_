"""Pairs with Specific Difference
Given an array arr of distinct integers and a nonnegative integer k, write a function findPairsWithGivenDifference that 
returns an array of all pairs [x,y] in arr, such that x - y = k. If no such pairs exist, return an empty array.
input:  arr = [0, -1, -2, 2, 1], k = 1
output: [[1, 0], [0, -1], [-1, -2], [2, 1]]"""

def find_pairs_with_given_difference(arr, k):
  print "Hello"
  res = []
  #a = arr.pop[0]
  array_b = arr[:]
  while len(array_b) != 0 : 
    a = array_b.pop(0)
    for each in arr:
      if each - a == k:
          res.append([each,a])
  return res
  
  
if __name__ == '__main__':
  find_pairs_with_given_difference( [1,5,11,7], 4)  
  #list = [24, 55, 66 ,2, 3, 24]
  #d1 = dict([i,None] for i in list)
  #if 24 in d1:
  #  print d1[24]  