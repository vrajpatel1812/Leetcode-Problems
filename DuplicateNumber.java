package Leetcode;

import java.util.Arrays;

public class DuplicateNumber {
    public static void main(String[] args) {
        int[] nums = {3,1,3,4,2};
        int ans = findDuplicate(nums);
        System.out.println(ans);
    }

    public static int findDuplicate(int[] nums) {
        Arrays.sort(nums);

        int i = 0, j = nums.length-1;

        while(i < j){
            int mid = i + j >> 1;

            if(mid+1 > nums[mid]){
                j = mid; 
            }else{
                i = mid+1;
            }
        }

        return i;
    }
}
