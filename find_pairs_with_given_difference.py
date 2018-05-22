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
      #print a 
      compliment = each - a 
      #print each
      #print arr
      if each - a == k:
        print 'in if'
        if each -a > 0: 
          res.append([each,a])
          #print str(res)+'res'
        #elif a - each > 0:
          #res.append([a,each])
          #print str(res)+'res'
      else:
        pass
  #print res 
  return res
  
  
if __name__ == '__main__':
  find_pairs_with_given_difference( [1,5,11,7], 4)  