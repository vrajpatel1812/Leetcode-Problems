package Leetcode;

import java.util.Arrays;

public class ReshapeMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2}, {3, 4}};
        int[][] ans = matrixReshape(matrix, 2, 4);
        for(int i = 0; i < ans.length; i++){
            System.out.println(Arrays.toString(ans[i]));
        }
    }

    public static int[][] matrixReshape(int[][] mat, int r, int c){
        if(r * c  != mat.length * mat[0].length){
            return mat;
        }

        int[][] ans = new int[r][c];

        int a = 0, b = 0;

        for(int i = 0; i<mat.length; i++){
            for(int j = 0; j<mat[i].length; j++){
                ans[a][b] = mat[i][j];
                b++;
                if(b == c){
                    b = 0;
                    a++;
                }
            }
        }

        return ans;
    }
}
