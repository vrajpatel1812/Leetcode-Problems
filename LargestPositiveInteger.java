package Leetcode;

import java.util.Arrays;

public class LargestPositiveInteger {
    public static void main(String[] args) {
        int[] nums = {-10,8,6,7,-2,-3};
        int ans = findMax(nums);
        System.out.println(ans);
    }

    public static int findMax(int[] nums) {
        Arrays.sort(nums);

        int i = 0, j = nums.length-1; 

        while(i < j && nums[i] < 0) {
            if(nums[i] * -1 == nums[j]){
                return nums[i];
            }

            if(nums[i] * -1 < nums[j]){
                j--;
            }else{
                i++;
            }
        }

        return -1;
    }
}
