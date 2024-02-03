package Leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MaxAfterPartion {
    public static void main(String[] args) {
        int[] arr = { 1, 15, 7, 9, 2, 5, 10 };
        int ans = maxSumAfterPartitioning(arr, 3);
        System.out.println(ans);
    }

    public static int maxSumAfterPartitioning(int[] arr, int k) {
        int size = arr.length;
        int[] dp = new int[size + 1];

        for (int i = 0; i < size; i++) {
            int maxSum = 0, maxCurr = 0;
            //System.out.println("Curent I : " + i);

            for (int j = i; j >= Math.max(0, i - k + 1); j--) {
                maxCurr = Math.max(maxCurr, arr[j]);
                //System.out.println("Curent J : "+ j);
                //System.out.println("MaxCurr : " + maxCurr);
                
                int curr = maxCurr * (i - j + 1) + dp[j];
                //System.out.println("Curr : " + curr);
                
                maxSum = Math.max(maxSum, curr);
                //System.out.println("MaxSum : " + maxSum);
            }

            dp[i + 1] = maxSum;
            System.out.println(Arrays.toString(dp));
        }

        return dp[size];
    }
}
