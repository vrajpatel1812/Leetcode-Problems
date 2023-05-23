package Leetcode;

public class CellwithOdds {
    public static void main(String[] args) {
        int[][] indices = {{0, 1}, {1, 1}};
        int odds = oddCells(2, 3, indices);
        System.out.println(odds);
    }

    public static int oddCells(int m, int n, int[][] indices){
        int[][] matrix = new int[m][n];

        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                matrix[i][j] = 0;
            }
        }

        for(int i = 0; i<indices.length; i++){
            int row = indices[i][0];
            int column = indices[i][1];

            for(int j = 0; j<n; j++){
                matrix[row][j] += 1;
            }

            for(int j = 0; j<m; j++){
                matrix[j][column] += 1;
            }
        }

        int odds = 0;

        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix[i].length; j++){
                if(matrix[i][j] % 2 != 0){
                    odds++;
                }
            }
        }

        return odds;
    }
}
