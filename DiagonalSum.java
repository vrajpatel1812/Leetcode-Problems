package Leetcode;

public class DiagonalSum {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        int sum = diagonalSum(mat);
        System.out.println(sum);
    }

    public static int diagonalSum(int[][] mat){
        int sum = 0;

        //primary diagonal sum
        for(int i = 0; i<mat.length; i++){
            sum += mat[i][i]; 
        }

        //secondary diagonal sum
        int j = mat.length-1;
        for(int i = 0; i<mat.length; i++){
            if(i==j){
                j--;
                continue;
            }
            sum += mat[i][j];
            j--;
        }

        return sum;
    }
}
