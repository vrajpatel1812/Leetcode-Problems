package Leetcode;

import java.util.Arrays;

public class RemoveDuplicateFromSortedArrayII {
    public static void main(String[] args) {
        int[] nums = { 0, 0, 0 };
        int ans = removeDuplicates(nums);
        System.out.println(ans);
    }

    public static int removeDuplicates(int[] nums) {
        int i = 1;

        for(int j = 2; j < nums.length; j++){
            if(nums[j] != nums[i-1]){
                nums[++i] = nums[j]; 
            }
        }

        return i+1;
    }
}