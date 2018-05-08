// A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
//Find the largest palindrome made from the product of two 3-digit numbers.

public class palindromeProduct {
    public static void main(String[] args) {
        int nums = 33;
        int palindrome = 0;
        String string_palindrome; 
        int temp;
        for (int i = 0; i < nums; i++) {
            for (int j = i + 1; j < nums; j++) {
                temp = i * j ; 
                string_palindrome =   Integer.toString(temp);
                    
                if (string_palindrome.equals(new StringBuilder(string_palindrome).reverse().toString())) {
                    //System.out.println(nums[i]);
                    //System.out.println(nums[j]);
                    palindrome = i*j;
                }
            }
        }
        System.out.println(palindrome);
    }
}