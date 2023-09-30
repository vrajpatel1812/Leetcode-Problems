package Leetcode;

import java.util.Stack;

public class Pattern {
    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 4};
        System.out.println(find132pattern(nums));
    }

    public static boolean find132pattern(int[] nums) {
        Stack<Integer> ans = new Stack<>();
        int third = Integer.MIN_VALUE;

        for(int i = nums.length-1; i>=0; i--) {
            if(nums[i] < third) {
                return true;
            }

            while(!ans.empty() && nums[i] > ans.peek()){
                third = ans.pop();
            }

            ans.push(nums[i]);
        }

        return false;
    }
}
