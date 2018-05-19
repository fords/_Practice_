#Python 3 
def flip_horizontal_axis(matrix):
    row_no = len(matrix)
    col_no = len(matrix[0])
    matrix_A = matrix 
    for i in range(int(row_no/2)):
        for j in range( col_no ):
            temp = matrix_A[row_no-i-1][j] 
            print("In loop") 
            matrix_A[row_no-i-1][j] = matrix_A[i][j]
            matrix_A[i][j] = temp 
    print(matrix_A)
    return(matrix_A)


def flip_vertical_axis(matrix):
    row_no = len(matrix)
    col_no = len(matrix[0])
    matrix_A = matrix 
    for i in range((row_no)):
        for j in range(int((col_no/2)) ):
            temp = matrix_A[i][col_no-j-1] 
            print("In loop") 
            matrix_A[i][col_no-j-1] = matrix_A[i][j]
            matrix_A[i][j] = temp 
    print(matrix_A)
    return(matrix_A)



if __name__ == "__main__":
    #flip_vertical_axis([[1,2,3],[4,5,6],[7,8,9]])
    flip_horizontal_axis([[1,2,3],[4,5,6],[7,8,9]])
	flip_horizontal_axis([[1,0,0],[0,0,1]])