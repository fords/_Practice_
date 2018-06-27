class Solution {
    /* private int lo, maxLen;

    public String longestPalindrome(String s) {
        int len = s.length();
        if (len < 2)
            return s;

        for (int i = 0; i < len-1; i++) {
            extendPalindrome(s, i, i);  //if odd length
            extendPalindrome(s, i, i+1); //if even length.
        }
        return s.substring(lo, lo + maxLen);
    }

    private void extendPalindrome(String s, int j, int k) {
        while (j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k)) {
            j--;
            k++;
        }
        if (maxLen < k - j - 1) {
            lo = j + 1;
            maxLen = k - j - 1;
        }
    }  */
	public String longestPalindrome(String s) {
         if (s.length() <= 1) return s;
         int i = 0, k = 0 , l = 0;  
         String result="";
         while ( i != s.length()){
             //System.out.println("loop " +i);
             k = i - 1; l = i + 1;
             while (k >= 0 && l <s.length() && s.charAt(k) == s.charAt(l)){
                   
                if ( l - k >= result.length()) {result = s.substring(k,l+1);} 
                k -= 1; l += 1;
                if ( k < 0 || l >= s.length()) break;
            }
               
             
             k = i; l = i+1;
             while ( k >= 0 && l <s.length() && s.charAt(k) == s.charAt(l) ){
                 if ( l - k >= result.length()) {result = s.substring(k,l+1);} 
                k -= 1; l += 1;
                if ( k < 0 || l >= s.length()) break;
            }
             i++;
        }
        if (result.length() == 0 ) return Character.toString(s.charAt(s.length()-1));
        return result;
    }
}

public class MainClass {
    public static String stringToString(String input) {
        if (input == null) {
            return "null";
        }
        return Json.value(input).toString();
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            String s = stringToString(line);
            
            String ret = new Solution().longestPalindrome(s);
            
            String out = (ret);
            
            System.out.print(out);
        }
    }
}