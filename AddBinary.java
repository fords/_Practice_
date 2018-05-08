class Solution {
    public String addBinary(String a, String b) {
        int number0 = Integer.parseInt(a, 2);
        int number1 = Integer.parseInt(b, 2);
        int sum = number0 + number1;
        int[] binaryNum = new int[100];
        int i = 0;
        while (sum > 0) 
        {
            binaryNum[i] = sum % 2;
            sum = sum / 2;
            i++;
        }
        // printing binary array in reverse order
        String str ="";
        for (int j = i - 1; j >= 0; j--){
            //System.out.print(binaryNum[j]);
            str +=   Integer.toString(binaryNum[j]) ;
        }
        //String str = Integer.toString(sum);
        return str;
    }
}

public class AddBinary {
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
            String a = stringToString(line);
            line = in.readLine();
            String b = stringToString(line);
            
            String ret = new Solution().addBinary(a, b);
            
            String out = (ret);
            
            System.out.print(out);
        }
    }
}