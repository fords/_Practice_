def flip_vertical_axis(matrix):
    for i in range(0, len(matrix)):
        for  j  in range (0,len(matrix[0])/2):
            temp = matrix[i][j]
            #print temp
            #print "i "+str(i)+' value '+ str(matrix[i])
            #print "i "+str(i)+' j '+str(j)+' value '+str(matrix[i][j])
            matrix[i][j] = matrix[i][len(matrix[0])-j-1]
            matrix[i][len(matrix[0])-j-1] = temp
    print 'result is \n'
    print  matrix   
    return matrix