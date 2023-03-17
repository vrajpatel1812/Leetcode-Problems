package Leetcode;

import java.util.Scanner;

public class Arangingcoins {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int ans = arragecoins(n);
        System.out.println(ans);
    }

    public static int arragecoins(int n){
        int i = 1;
        while(n >= 0){             
            n = n - i;
            i = i + 1;
            if(n - i < 0){
                return i-1;
            }
        }
        return i;
    }
}
