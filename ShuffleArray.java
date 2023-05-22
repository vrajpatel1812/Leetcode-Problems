package Leetcode;

import java.util.Arrays;

public class ShuffleArray {
    public static void main(String[] args) {
        int[] nums = {2, 5, 1, 3, 4, 7};
        int[] ans = shuffle(nums, 3);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] shuffle(int[] nums, int n){
        int[] ans = new int[nums.length];

        int j = 0;

        for(int i = 0; i<n; i++){
            ans[j] = nums[i];
            ans[j+1] = nums[n+i]; 
            j=j+2;
        }

        return ans;
    }
}
