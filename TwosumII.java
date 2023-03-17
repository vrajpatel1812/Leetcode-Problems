package Leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class TwosumII {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Array : ");
        int[] numbers = new int[3];
        for(int i = 0; i<3 ; i++){
            numbers[i] = scan.nextInt();
        }
        System.out.println("Enter Target : ");
        int target = scan.nextInt();
        int[] ans = new int[2];
        ans = twosum(numbers, target);
        System.out.println(Arrays.toString(ans));
    }  

    public static int[] twosum(int[] numbers, int target){
        int left = 0, right = numbers.length - 1;  
        int[] ans = new int[2]; 
        while(left < right){                                 
            int sum = numbers[left] + numbers[right];
            if(sum == target){
                ans[0] = left + 1;
                ans[1] = right + 1;
                break;
            }else if(sum > target){
                right = right - 1;
            }else{
                left = left + 1;
            }
        }
        return ans;
    }  
}
