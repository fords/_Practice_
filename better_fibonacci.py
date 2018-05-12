def better_fibonacci(n):
    n1 = 1 ; n2 = 0
    if n == 0 :
        return 0
    if n == 1:
        return 1
    else:
        for i in range(2, n+1):
            temp = n1 + n2
            n2 = n1
            n1 = temp 
        return n1