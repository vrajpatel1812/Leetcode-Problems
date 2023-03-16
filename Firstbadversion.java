package Leetcode;

import java.util.Scanner;

public class Firstbadversion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int ans = firstbadversion(a);
        System.out.println(ans);
    }

    public static boolean isBadversion(int a){
        int b = 5; //Here, I consider 5 is always going to bad version
        if(a == b){
            return true;
        }
        return false;
    }

    // 1, 2, 3, 4, 5, 6
    // now bad start from 4
    // mid = 3 
    // isbadversion(mid) == false left = mid
    // isbadversion(mid) == true right = mid 
    // isbadversion(mid-1) == false && isbadversion(mid) == true return a[mid]

    public static int firstbadversion(int n){
        int left = 0, right = n;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(isBadversion(mid-1) == false && isBadversion(mid) == true){  
                return mid;
            }else if(isBadversion(mid) == false){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return -1;
    }

}