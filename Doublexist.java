package Leetcode;

import java.util.Scanner;


public class Doublexist {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i = 0; i<arr.length; i++){
            arr[i] = scan.nextInt();
        }
        boolean ans = checkifndoubleeexist(arr);
        System.out.println(ans);
    }

    public static boolean checkifndoubleeexist(int[] arr){
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr.length; j++){
                if(i != j){
                    if(arr[i] == arr[j]*2){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
