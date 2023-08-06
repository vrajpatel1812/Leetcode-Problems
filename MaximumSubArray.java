package Leetcode;

import java.util.Arrays;

public class MaximumSubArray {
    public static void main(String[] args) {
        int[] nums = {1};
        int ans = maxSubArray(nums);
        System.out.println(ans);
    }

    public static int maxSubArray(int[] nums) {
        int sum = 0, max = Integer.MIN_VALUE, size = nums.length;

        for(int i = 0; i<size; i++){
            sum += nums[i];
            max = Math.max(max, sum);

            if(sum < 0){
                sum = 0;
            }
        }

        return max;
    }
}
