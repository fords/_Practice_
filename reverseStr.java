class Solution {
    public String reverseStr(String s, int k) {
        String[] arr = s.split("");
        int n = arr.length;
        int i = 0;
        while(i < n) {
            int j = Math.min(i + k - 1, n - 1);
            swap(arr, i, j);
            i += 2 * k;
        }
        StringBuilder builder = new StringBuilder();
        for(String each: arr) {
            builder.append(each);
        }
        String str = builder.toString();
        return str;
    }
    private void swap(String[] arr, int l, int r) {
        while (l < r) {
            String temp = arr[l];
            arr[l++] = arr[r];
            arr[r--] = temp;
        }
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
            line = in.readLine();
            int k = Integer.parseInt(line);
            
            String ret = new Solution().reverseStr(s, k);
            
            String out = (ret);
            
            System.out.print(out);
        }
    }
}