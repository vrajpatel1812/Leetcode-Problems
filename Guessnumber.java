package Leetcode;

import java.util.Scanner;

public class Guessnumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int ans = guessnumber(a, b);
        System.out.println(ans);
    }
    public static int guessnumber(int n, int target){
        int left = 0, right = n;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(mid == target){  //Use Guess Function which given in Problem
                return mid;
            }else if(mid < target){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return -1;
    }
}
