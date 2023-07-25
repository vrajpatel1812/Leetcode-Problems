package Leetcode;

import java.util.Arrays;
import java.util.HashSet;

public class AvgofDistinct {
    public static void main(String[] args) {
        int[] nums = {9,5,7,8,7,9,8,2,0,7};
        int ans = distinctAverages(nums);
        System.out.println(ans);
    }

    public static int distinctAverages(int[] nums) {
        Arrays.sort(nums);

        int i = 0, j = nums.length-1;

        HashSet<Double> ans = new HashSet<>();

        while(i < j){
            double temp1 = nums[i++];
            double temp2 = nums[j--];
            double avg = (temp1+temp2) / 2;
            ans.add(avg);
        }

        return ans.size();
    }
}
