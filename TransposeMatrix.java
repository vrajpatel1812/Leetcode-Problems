package Leetcode;

import java.util.Arrays;

public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6}};
        int[][] tranpose = tranpose(matrix);
        for(int i = 0; i<tranpose.length; i++){
            System.out.println(Arrays.toString(tranpose[i]));
        }
    }

    public static int[][] tranpose(int[][] matrix){
        int[][] tranpose = new int[matrix[0].length][matrix.length];

        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix[i].length; j++){
                tranpose[j][i] = matrix[i][j];
            }
        }

        return tranpose;
    }
}
