package Leetcode;

import java.util.Arrays;

public class DuplicatZeros {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 0, 4, 5, 0};
        duplicateZeros(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void duplicateZeros(int[] arr) {
        int[] ans = arr.clone();

        int i = 0;
        int j = 0;

        while(i < arr.length){
            if(ans[j] == 0 && arr.length-1 > i){
                arr[i] = 0;
                arr[i+1] = 0;
                i+=2;
                j++;
            }else{
                arr[i] = ans[j];
                j++;
                i++;
            }
        }
    }
}
