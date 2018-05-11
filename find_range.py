"""Given a sorted list and an input number as inputs, write a function to return a Range object, consisting of the indices of the first and last occurrences of the input number in the list. """
def find_range(input_list,input_number):
    low = 0; upper = 0;
    flag = 0
    for i in range(0,len(input_list)):
        temp = input_list.pop(0)
        if input_number in input_list and flag == 0:
            low = input_list.index(input_number) + 1
            flag = 1
        if input_number==temp and flag == 1:
            upper = i
    return Range(low,upper)