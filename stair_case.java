import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/* Consider a staircase of size :

   #
  ##
 ###
####        */
public class Solution {
    
    // Complete the staircase function below.
    static void staircase(int n) {
        StringBuilder result = new StringBuilder();
        String result_str;
        for (int i = 1 ; i < n+1 ; i++){
            // append white space (n-1) + n # 
            for ( int j = 1 ; j < n-i+1 ; j++ ){
                result = result.append(" ");
            }
            for ( int j= 1 ; j< i+1; j++){ 
                result = result.append("#");
            }
            result_str = (result.toString()); 
            System.out.println(result_str);
            result = new StringBuilder();
        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }
}