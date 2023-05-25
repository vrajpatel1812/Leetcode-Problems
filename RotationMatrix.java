package Leetcode;

import java.util.Arrays;

public class RotationMatrix {
    public static void main(String[] args) {
        int[][] mat = {{0,0,0}, {0,1,0}, {1,1,1}};
        int[][] target = {{1,1,1}, {0,1,0}, {0,0,0}};
        boolean ans = findRotation(mat, target);
        System.out.println(ans);
    }

    public static boolean findRotation(int[][] mat, int[][] target){
        int[][] rotation = rotateMatrix(mat);

        for(int i = 1; i<4; i++){
            if(Arrays.deepEquals(rotation, target)){
                return true;
            }
            rotation = rotateMatrix(rotation);
        }

        return false;
    }


    public static int[][] rotateMatrix(int[][] matrix){
        int[][] rotation = new int[matrix.length][matrix.length];
        
        int n = matrix.length-1;

        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix[i].length; j++){
                rotation[i][j] = matrix[j][n-i];
            }
        }

        return rotation;
    }
}
