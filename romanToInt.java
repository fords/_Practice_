class Solution {
    public int romanToInt(String s) {
    Map<Character, Integer> map = new HashMap<Character, Integer>()
    {{
         put('I', 1);
         put('V', 5);
         put('X', 10);
         put('L', 50);
         put('C', 100);
         put('D', 500);
         put('M', 1000);
    }};
    
    int result = 0;
    
    if(s.length() == 0) return 0;

    if(s.indexOf("IV")!=-1) result -= 2;
    if(s.indexOf("IX")!=-1)	result -= 2;
    if(s.indexOf("XL")!=-1)	result -= 20;
    if(s.indexOf("XC")!=-1)	result -= 20;
    if(s.indexOf("CD")!=-1)	result -= 200;
    if(s.indexOf("CM")!=-1)	result -= 200;

    char arr[] = s.toCharArray();

	for(int i=0; i<s.length(); i++){
	    result += map.get(arr[i]);
	}

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
            
            int ret = new Solution().romanToInt(s);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}