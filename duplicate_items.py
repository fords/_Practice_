"""Write a function - duplicate_items to find the redundant or repeated items in a list and return them in sorted order. 
This method should return a list of redundant integers in ascending sorted order  """

def duplicate_items(list_numbers):
    list_res = []
    list_numbers.sort()
    for i in range(0,len(list_numbers)):
        list1 = list_numbers.pop(0)
        if list1 in list_numbers:
            list_res.append(list1)
    return list_res
	
	
#  [list.append(x) for x in list_numbers if x not in list]   #one line coding for unique numbers in a list


"""def duplicate_items(list_numbers):
    set_list = set(list_numbers)
    return [i for i in set_list if list_numbers.count(i)>1]"""
	