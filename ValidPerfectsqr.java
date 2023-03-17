package Leetcode;

import java.util.Scanner;

public class ValidPerfectsqr {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        boolean ans = isPerfectSquare(num);
        System.out.println(ans);
    }
    public static boolean isPerfectSquare(int num){
        if(num < 2){
            return true;
        }
        for(int i = 1; i<=num/i; i++){
            if((float)num/i  == (float)i){
                return true;
            }    
        }
        return false;
    }
}
