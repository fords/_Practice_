def transpose_matrix(matrix):
    matrixA = [[0 for x in range(len(matrix[0]))] for y in range(len(matrix))]
    for i in range(0,len(matrix)):  # row 
        for j in range(0,len(matrix[0])):   # col
            matrixA[i][j] = matrix[j][i]
            print 'i '+str(i)+' j '+str(j)
    print matrixA
    return matrixA

if __name__ == '__main__':
    transpose_matrix([[1,2,3], [4,5,6], [7,8,9]])