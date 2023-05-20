package Leetcode;

import java.util.Arrays;
import java.util.HashSet;

public class SetMismatch {
    public static void main(String[] args) {
        int[] nums = {3,3,1,4};
        int[] ans = findErrorNums(nums);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] findErrorNums(int[] nums){
        HashSet<Integer> a = new HashSet<Integer>();
        int[] ans = new int[2];

        for(int i = 0; i < nums.length; i++){
            if(a.contains(nums[i])){
                ans[0] = nums[i];
            }
            a.add(nums[i]);
        }

        for(int i = 1; i<= nums.length; i++){
            if(!a.contains(i)){
                ans[1] = i;
                break;
            }
        }

        return ans;
    }
}
