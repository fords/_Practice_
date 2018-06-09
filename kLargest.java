public class kLargestkLargest {

     public static void kLargest(Integer[] arr, int k) {
         Arrays.sort(arr, Collections.reverseOrder());
         //Integer[] arr2 = new Integer[k];
         for ( int i =0 ; i < k; i ++){
             
             //arr2[i] = arr[i]; 
             System.out.println(arr[i]);
         }
         
     }

     public static void main(String[] args) 
    {
        Integer[] arr = new Integer[]{1, 23, 12, 9, 
                                       30, 2, 50};
        int k = 3;
        kLargest(arr,k);     
    }
}