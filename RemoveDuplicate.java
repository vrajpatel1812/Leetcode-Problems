package Leetcode;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicate{
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int ans = removeDuplicate(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static int removeDuplicate(int[] nums){
        HashSet<Integer> ans = new HashSet<Integer>();

        for(int i = 0; i < nums.length; i++){
            if(!ans.contains(nums[i])){ 
                ans.add(nums[i]);
            }
        }

        int[] nums1 = new int[ans.size()];
        int i = 0;

        for(Integer a : ans){
            nums1[i] = a;
            i++;
        }

        Arrays.sort(nums1);

        for(i = 0; i<nums1.length; i++){
            nums[i] = nums1[i];
        }

        return ans.size();
    }
}