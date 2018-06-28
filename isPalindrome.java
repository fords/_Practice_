class isPalindrome {
    public boolean isPalindrome(int x) {
        String str = Integer.toString(x);
        if (str.length() == 1) { return true; }
        if (str.length() < 1 ) {return false;}
        if (str.length()%2 == 0){
            for ( int i = 0 ; i < str.length() /2 ; i++){
                if ( str.charAt(i) != str.charAt(str.length()-i-1)){ return false;}
                
            }
            return true;
        }
        else{
            for ( int i = 0 ; i < str.length()/2  ; i++){
                if ( str.charAt(i) != str.charAt(str.length()-i-1)){ return false;}
                
            }
            return true;
        }
    }
}

public class MainClass {
    public static String booleanToString(boolean input) {
        return input ? "True" : "False";
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        // while ((line = in.readLine()) != null) {
        //     int x = Integer.parseInt(line);
            
            boolean ret = new isPalindrome().isPalindrome(121);
            
            String out = booleanToString(ret);
            
            System.out.print(out);
        //}
    }
}