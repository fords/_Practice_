
/*
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1]. */


public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello World!");
        int[] nums;
        int[] res;
        nums = new int[] {1,2,3};
        int target =5;
        res = twoSum(nums, target);  
        System.out.println("1st number is "+ nums[res[0]]);
        System.out.println("2nd number is "+ nums[res[1]]);
    }
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    //System.out.println(nums[i]);
                    //System.out.println(nums[j]);
                    return new int[] { i, j };
                }
            }
        }
    throw new IllegalArgumentException("No two sum solution"); 
    } 
}