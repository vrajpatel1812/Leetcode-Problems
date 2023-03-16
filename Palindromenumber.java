package Leetcode;

import java.util.Stack;

public class Palindromenumber {
    public static void main(String[] args) {
        int x = 121;
        boolean a = isPalinedrome(x);
        System.out.println(a);
    }
    public static boolean isPalinedrome(int x){
        if(x<0){
            return false;
        }
        int temp = x;
        int rev = 0;
        while(temp!=0){
            int rem = temp % 10;
            rev = rev*10 + rem;
            temp = temp/10;
        }
        if(x == rev){
            return true;
        }
        return false;
    }
}
