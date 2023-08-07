package Leetcode;

public class Search2Dmatrix {
    public static void main(String[] args) {
        int[][] matrix = {{-8,-7,-5,-3,-3,-1,1},{2,2,2,3,3,5,7},{8,9,11,11,13,15,17},{18,18,18,20,20,20,21},{23,24,26,26,26,27,27},{28,29,29,30,32,32,34}};
        System.out.println(searchMatrix(matrix, -5));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int size = matrix.length;

        if (matrix[0][0] > target) {
            return false;
        }
        
        for (int i = 0; i < size; i++) {
            if (target <= matrix[i][matrix[i].length - 1] && target >= matrix[i][0]) {
                if(target == matrix[i][matrix[i].length - 1]){
                    return true;
                }
                
                if(target == matrix[i][0]){
                    return true;
                }

                return search(matrix, target, i);
            }
        }

        return false;
    }

    public static boolean search(int[][] matrix, int target, int i) {
        int left = 1, right = matrix[i].length - 2;

        while (left <= right) {
            int mid = left + right >> 1;
            if (matrix[i][mid] == target) {
                return true;
            } else if (matrix[i][mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return false;
    }
}
