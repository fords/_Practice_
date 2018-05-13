class Range(object):
    def __init__(self):
        self.lower_bound = -1
        self.upper_bound = -1
    
    def __init__(self,lower_bound,upper_bound):
        self.lower_bound = lower_bound
        self.upper_bound = upper_bound
 
    def __str__(self):
        return "["+str(self.lower_bound)+","+str(self.upper_bound)+"]"
    
def merge_ranges(input_range_list):
    if (input_range_list == None or len(input_range_list) <= 1):
        return input_range_list
    output_list = []
    previous = input_range_list[0]
    i = 1
    while i < len(input_range_list):
        current = input_range_list[i]
        if (previous.upper_bound >= current.lower_bound):
            merged = Range(previous.lower_bound, max(previous.upper_bound, current.upper_bound));
            previous = merged
        else:
            output_list.append(previous)
            previous = current
        i = i + 1
    
    output_list.append(previous)
    
    return output_list

if __name__ == '__main__':
    range1 = Range( 1,4)
    #print range1.__str__()
    range_result =  merge_ranges( [Range(1,4), Range(3,7), Range(1,10), Range(13,20)])
    for i in range_result:
        print i.__str__()
    