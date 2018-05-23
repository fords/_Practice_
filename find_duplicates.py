def find_duplicates(arr1, arr2):
  
  d1 = dict([i,0] for i in arr2)
  res = []
  print d1
  while len(arr1) != 0 :
    a = arr1.pop(0)
    if a in d1:
      res.append(a)
  #res1 = res.sort()
  print res
  return res 
  

if __name__ == '__main__':
  find_duplicates([1, 2, 3, 5, 6, 7], [3, 6, 7, 8, 20])