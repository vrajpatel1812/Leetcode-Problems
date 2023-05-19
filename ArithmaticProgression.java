package Leetcode;

import java.util.Arrays;

public class ArithmaticProgression {
    public static void main(String[] args) {
        int[] arr = {4, 2, 1};
        System.out.println(canMakeArithmaticProgression(arr));
    }

    public static boolean canMakeArithmaticProgression(int[] arr){
        Arrays.sort(arr);

        int diff = arr[1] - arr[0];

        for(int i = 2; i<arr.length; i++){
            if(diff != arr[i] - arr[i-1]){
                return false;
            }
        }

        return true;
    }
}
