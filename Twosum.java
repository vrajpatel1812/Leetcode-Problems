package Leetcode;

import java.util.Arrays;

public class Twosum {
    public static void main(String[] args) {
        int[] a = new int[]{2, 4, 5, 7, 10};
        int target = 17;
        int[] indexs = twosum(a, target);
        System.out.println(Arrays.toString(indexs));
    }
    static public int[] twosum(int[] nums, int target){
        int[] result = new int[]{0, 0};
        for(int i = 0; i<nums.length; i++){
            for(int j = i+1; j<nums.length; j++){
                if(nums[i] + nums[j] == target){
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }
}