package Leetcode;

import java.util.Arrays;

public class SpiralOrderII {
    public static void main(String[] args) {
        int[][] matrix = generateMatrix(3);
        for(int i = 0; i<matrix.length; i++){
            System.out.println(Arrays.toString(matrix[i]));
        }
    }

    public static int[][] generateMatrix(int n){
        int[][] matrix = new int[n][n];

        int i = 1;
        int n1 = 0;
        int n2 = n-1;

        while(n*n >= i){
            for(int j = n1; j <= n2 && n * n >= i; j++){
                matrix[n1][j] = i;
                i++;
            }

            for(int j = n1+1; j <= n2 && n * n >= i; j++){
                matrix[j][n2] = i;
                i++;
            }

            for(int j = n2 - 1; j >= n1 && n * n >= i; j--){
                matrix[n2][j] = i;
                i++;
            }

            for(int j = n2 - 1; j > n1 && n * n >= i; j--){
                matrix[j][n1] = i;
                i++;
            }

            n1++;
            n2--;
        }

        return matrix;
    }
}

