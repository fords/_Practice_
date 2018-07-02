class Solution {
    public int missingNumber(int[] nums) {
        int sum  = 0;
        int length = nums.length;
        for (int each:nums) {
            sum  += each;
        }
        return (nums.length * (nums.length + 1) )/ 2 - sum;
    }
}