package Leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SmallThanCurrent {
    public static void main(String[] args) {
        int[] nums = {8, 1, 2, 2, 3};
        int[] ans = smallerThanCurrent(nums);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] smallerThanCurrent(int[] nums){
        Map<Integer, Integer> a = new HashMap<Integer, Integer>();
        int[] sorted = nums.clone();

        Arrays.sort(sorted);

        int j = 0;

        for(int i = 0; i<nums.length; i++){
            a.putIfAbsent(sorted[i], i);
        }

        for(int i = 0; i<nums.length; i++){
            nums[i] = a.get(nums[i]);
        }

        return nums;
    }
}
