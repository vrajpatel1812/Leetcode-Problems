package Leetcode;

import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class Peakindexinmoutain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter Array : ");
        for(int i=0; i<5; i++){
            arr[i] = scan.nextInt();
        }
        int ans = peakIndexMountainArray(arr);
        System.out.println("Peak Index Array : ");
        System.out.println(ans);
    }

    public static int peakIndexMountainArray(int[] arr){
        int max = arr[0];
        int index = 0;
        for(int i=1; i<arr.length-1; i++){
            if(max < arr[i]){
                max = arr[i];
                index = i;
            }else{
                break;
            }
        }
        return index;
    }
}
