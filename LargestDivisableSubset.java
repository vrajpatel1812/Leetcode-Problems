package Leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LargestDivisableSubset {
    public static void main(String[] args) {
        int[] nums = { 4, 8, 10, 240 };
        List<Integer> ans = largestDivisibleSubset(nums);
        System.out.println(ans);
    }

    public static List<Integer> largestDivisibleSubset(int[] nums) {
        List<Integer> ans = new LinkedList<>();
        Arrays.sort(nums);
        int size = nums.length;
        int[] dp = new int[size];
        Arrays.fill(dp, 1);

        int maxLength = 0, maxSize = 1;
        for (int i = 1; i < size; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] % nums[j] == 0) {

                    dp[i] = Math.max(dp[i], dp[j] + 1);

                    if (dp[i] > maxSize) {
                        maxSize = dp[i];
                        maxLength = i;
                    }
                }
            }
        }

        int num = nums[maxLength];
        for (int i = maxLength; i >= 0; i--) {
            if (num % nums[i] == 0 && dp[i] == maxSize) {
                ans.add(nums[i]);
                num = nums[i];
                maxSize--;
            }
        }

        return ans;
    }
}
