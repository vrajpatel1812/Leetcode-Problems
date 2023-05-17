package Leetcode;

import java.util.Arrays;

public class SortByParity {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] ans = sortArrayByParity(nums);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] sortArrayByParity(int[] nums){
        int[] ans = new int[nums.length];
        int j = 0;

        for(int i = 0;i<nums.length;i++){
            if(nums[i] % 2 == 0){
                ans[j] = nums[i];
                j++;
            }
        }

        for(int i = 0;i<nums.length;i++){
            if(nums[i] % 2 != 0){
                ans[j] = nums[i];
                j++;
            }
        }

        return ans;
    }
}
