package Leetcode;

import java.util.LinkedList;
import java.util.Scanner;

public class Kthelement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i=0; i<5; i++){
            arr[i] = scan.nextInt();
        }
        int k = scan.nextInt();
        int ans = findkthpositive(arr, k);
        System.out.println(ans);
    }
    public static int findkthpositive(int[] arr, int k){
        int left = 0, right = arr.length;
        while(left < right){
            int mid = left + (right - left)/2;
            if(arr[mid] - mid - 1 >= k){
                right = mid;
            }else{
                left = mid + 1;
            }
        }
        return left + k;
    }
}
