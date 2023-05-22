package Leetcode;

import java.util.Arrays;

public class RunningSum {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] ans = runningSum(nums);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] runningSum(int[] nums){
        int[] ans = new int[nums.length];

        for(int i = 0; i<nums.length; i++){
            int sum = 0;
            for(int j = 0; j<i+1; j++){
                sum += nums[j];
            }
            ans[i] = sum;
        }

        return ans;
    }
}
