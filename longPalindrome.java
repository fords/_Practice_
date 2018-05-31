class Solution {
    public String longestPalindrome(String s) {
    int ans = 0;
    int lt = 0;
    int rt = 0;
    for(int i=0;i<s.length();i++){
        for(int j=i+ans;j<s.length();j++){
            if(isPalindromic(s.substring(i,j+1))){
                if(ans<(j-i+1)){
                ans = j-i+1;
                lt = i;
                rt = j;
                }
            }
        }
    }
    return s.substring(lt,rt+1);
    }
    
    public boolean isPalindromic(String s){
            boolean ret = true;
            for(int i=0;i<s.length()>>1;++i){
                if(s.charAt(i) != s.charAt(s.length()-1-i)){
                ret = false;
                break;
                }
    }
    return ret;
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
            //s = "babad";
            String ret = new Solution().longestPalindrome(s);
            
            String out = (ret);
            
            System.out.print(out);
        }
    }
}