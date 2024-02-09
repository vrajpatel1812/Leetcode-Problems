package Leetcode;

import java.util.Arrays;

public class PerfectSquares {
    public static void main(String[] args) {
        int ans = numSquares(12);
        System.out.println(ans);
    }

    public static int numSquares(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        for(int i = 1; i<=n; i++) {
            int minValue = Integer.MAX_VALUE;

            for(int j = 1; j*j <= i; j++) {
                minValue = Math.min(minValue, dp[i - j * j] + 1);
            }

            dp[i] = minValue;
        }

        return dp[n];
    }
}
