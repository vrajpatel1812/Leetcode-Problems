package Leetcode;

import java.util.LinkedList;
import java.util.List;

public class LuckynoMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{3, 7, 8}, {9, 11, 13}, {15, 16, 17}};
        List<Integer> ans = luckyNumbers(matrix);
        System.out.println(ans);
    }

    public static List<Integer> luckyNumbers(int[][] matrix){
        List<Integer> minimum = new LinkedList<Integer>();

        for(int i = 0; i<matrix.length; i++){
            int min = min(matrix[i]);
            minimum.add(min);
        }

        List<Integer> ans = new LinkedList<Integer>();

        for(int i = 0; i<matrix[0].length; i++){
            int max = matrix[0][i];

            for(int j = 0; j<matrix.length; j++){
                if(max < matrix[j][i]){
                    max = matrix[j][i];
                }
            }

            if(minimum.contains(max)){
                ans.add(max);
            }
        }

        return ans;
    }

    public static int min(int[] matrix){
        int min = matrix[0];

        for(int i = 0; i<matrix.length; i++){
            if(matrix[i] < min){
                min = matrix[i];
            }
        }

        return min;
    }
}
