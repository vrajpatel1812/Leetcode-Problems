package Leetcode;

import java.util.Arrays;

public class FlipImage {
    public static void main(String[] args) {
        int[][] image = {{1,1,0},{1,0,1},{0,0,0}};
        int[][] flipped = flipAndInvertImage(image);
        for (int i = 0; i < flipped.length; i++) {
            System.out.println(Arrays.toString(flipped[i]));
        }
    }

    public static int[][] flipAndInvertImage(int[][] image){
        int[][] invert = new int[image.length][image.length];

        for(int i = 0; i<image.length; i++){
            int k = 0;
            for(int j = image[i].length-1; j+1 > 0; j--){
                invert[i][k] = image[i][j];
                k++;
            }
        }

        for(int i = 0; i<invert.length; i++){
            for(int j = 0; j<invert[i].length; j++){
                if(invert[i][j] == 1){
                    invert[i][j] = 0;
                }else{
                    invert[i][j] = 1;
                }
            }
        }

        return invert;
    } 
}
