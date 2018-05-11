def bubble_sort(a_list):
    for tail in range(len(a_list),-1,-1):
        for i in range(0,len(a_list) - 1):
            if a_list[i] > a_list[i+1]:
                temp = a_list[i+1]
                a_list[i+1] = a_list[i]
                a_list[i] = temp
                print a_list
        print a_list
    return a_list

if __name__ == '__main__':
    bubble_sort([1, 4, 0, 5, 2])