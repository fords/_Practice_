"""Given an list of integers, write a method - max_gain - that returns the maximum gain. Maximum Gain is defined as the maximum difference between 2 elements in a list such that the larger element appears after the smaller element. If no gain is possible, return 0. """
def max_gain(input_list):
    max = 0
    min = 0
    max_index = 0 ; min_index = 0
    for i in range(0,len(input_list)):
        if max < input_list[i]:
            max = input_list[i]
            max_index = i
        if min > input_list[i]:
            min = input_list[i]
            min_index = i
    if max_index > min_index:
        return max - min
    else:
        return 0
            
if __name__ == '__main__':
    print max_gain([100,40,20,10])