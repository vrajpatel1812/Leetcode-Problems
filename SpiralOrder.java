package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class SpiralOrder {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        List<Integer> ans = spiralOrder(matrix);
        System.out.println(ans);
    }

    public static List<Integer> spiralOrder(int[][] matrix){
        if(matrix.length == 0){
            return new ArrayList<>();
        }

        List<Integer> result = new ArrayList<Integer>();

        int m = matrix.length;
        int n = matrix[0].length;
        int r1 = 0;
        int c1 = 0;
        int r2 = m - 1;
        int c2 = n - 1;

        while(result.size() < m * n){
            for(int i = c1; i <= c2 && result.size() < m*n; i++){
                result.add(matrix[r1][i]);
            }

            for(int i = r1+1; i <= r2 && result.size() < m*n; i++){
                result.add(matrix[i][c2]);
            }

            for(int i = c2-1; i >= c1 && result.size() < m*n; i--){
                result.add(matrix[r2][i]);
            }

            for(int i = r2 - 1; i > r1 && result.size() < m*n; i--){
                result.add(matrix[i][c1]);
            }

            r1++;
            c1++;
            r2--;
            c2--;
        }

        return result;
       
    }
}
