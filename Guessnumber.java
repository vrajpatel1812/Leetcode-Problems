package Leetcode;

import java.util.Scanner;

public class Guessnumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt(); //Input should be greater than 10 cause guess function always gives you pick 10
        int ans = guessnumber(a);
        System.out.println(ans);
    }

    public static int guess(int num){
        int pick = 10; //Here, My pick is always goint to 10 
        if(num == pick){
            return 0;
        }else if(num > pick){
            return -1;
        }else{
            return 1;
        }
    }

    public static int guessnumber(int n){
        int left = 0, right = n;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(guess(mid) == 0){
                return mid;
            }else if(guess(mid) == 1){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return -1;
    }
}
