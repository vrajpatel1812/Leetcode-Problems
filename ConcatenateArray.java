package Leetcode;

import java.util.Arrays;

public class ConcatenateArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        int[] ans = getConcatenation(nums);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] getConcatenation(int[] nums){
        int[] ans = new int[nums.length*2];

        int j = nums.length;

        for(int i=0; i<nums.length; i++){
            ans[i] = nums[i];
            ans[j] = nums[i];
            j++;
        }

        return ans;
    }
}
