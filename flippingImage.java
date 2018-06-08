// "static void main" must be defined in a public class.
public class flippingImage {
    public static void main(String[] args) {
         int[][] A ={{1,1,0},{1,0,1},{0,0,0}};
         for ( int i = 0 ; i < A.length; i++) {
             for ( int j = 0 ; j < A[0].length/2; j++) {
                 int[][] temp =new int[1][1];
                 temp[0][0] = A[i][j] ;
                 A[i][j] =  A[i][A[0].length-j-1]; 
                 A[i][A[0].length-j-1] =temp[0][0];
             }
         }
         for ( int i = 0 ; i < A.length ; i++ ){
             for ( int j = 0 ; j < A[0].length ; j++){
                 if (A[i][j] == 0) { A[i][j] = 1;}
                 else if (A[i][j] == 1 ){ A[i][j] = 0;}
             }
         }
         for ( int[] each:A){
             for (int e:each) {   
				System.out.print (e); 
			} 
			System.out.println(); 
		}
    }
}