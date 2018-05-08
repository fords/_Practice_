/*You are climbing a stair case. It takes n steps to reach to the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?*/

class Solution {
    public int climbStairs(int n) {
        if ( n <= 0 ) { throw new IllegalArgumentException("n must be positive"); }
        else if ( n == 1  ){return 1;}
        else if ( n == 2 ){return 2;}
        else if ( n == 3 ){ return 3 ;}
        //else if (n == 4 ){}
            
        else{
            
            return  climbStairs(n-1) + climbStairs(n-2);
        }
    }
}

public class ClimbingStairs {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int n = Integer.parseInt(line);
            
            int ret = new Solution().climbStairs(n);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}