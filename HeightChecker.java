package Leetcode;

import java.util.Arrays;

public class HeightChecker{
    public static void main(String[] args) {
        int[] heights = {1,2,3,4,5};
        int ans = heightchecker(heights);
        System.out.println(ans); 
    }

    public static int heightchecker(int[] heights){
        int count = 0;

        int[] sortedheight = new int[heights.length];

        for(int i = 0; i<heights.length; i++){
            sortedheight[i] = heights[i];
        }
        
        Arrays.sort(sortedheight);

        for(int i = 0; i<heights.length; i++){
            if(heights[i] != sortedheight[i]){
                count++;
            }
        }

        return count;
    }
}