package Leetcode;

import java.util.Arrays;

public class MinfallingPath {
    public static void main(String[] args) {
        int[][] matrix = {{2, 1, 3}, {6, 5, 4}, {7, 8, 9}};
        int ans = minFallingPathSum(matrix);
        System.out.println(ans);
    }

    public static int minFallingPathSum(int[][] matrix) {
        int rowSize = matrix.length;
        int colSize = matrix[0].length;

        if(rowSize == 1 && colSize == 1) {
            return matrix[0][0];
        }

        int[][] dp = new int[rowSize][colSize];
        int ans = Integer.MAX_VALUE;

        for(int[] row : dp) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }

        for(int i = 0; i<rowSize; i++) {
            ans = Math.min(ans, minFallingPathSum(matrix, 0, i, dp));
        }

        return ans;
    }

    public static int minFallingPathSum(int[][] matrix, int row, int col, int[][] dp) {
        int rowSize = matrix.length;
        int colSize = matrix[0].length;

        if(dp[row][col] != Integer.MAX_VALUE) {
            return dp[row][col];
        }

        if(row == rowSize-1) {
            return dp[row][col] = matrix[row][col];
        }

        int left = Integer.MAX_VALUE, right = Integer.MAX_VALUE;

        if(col > 0) {
            left = minFallingPathSum(matrix, row+1, col-1, dp);
        }

        if(col < colSize-1) {
            right = minFallingPathSum(matrix, row+1, col+1, dp);
        }

        int staight = minFallingPathSum(matrix, row+1, col, dp);

        dp[row][col] = Math.min(left, Math.min(staight, right)) + matrix[row][col];

        return dp[row][col];
    }
}
