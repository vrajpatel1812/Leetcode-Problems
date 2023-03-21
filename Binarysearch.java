package Leetcode;

import java.util.Scanner;

public class Binarysearch {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] nums = new int[5];
        System.out.println("Enter an Array :");
        for(int i=0; i<5; i++){
            nums[i] = scan.nextInt();
        }
        System.out.println("Enter an Target :");
        int target = scan.nextInt();
        int ans = search(nums, target);
        System.out.println("Answer : ");
        System.out.println(ans);
    }

    public static int search(int[] nums, int target){
        int left = 0, right = nums.length-1;
        while(left <= right){
            int mid = left + right >> 1;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] > target){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return -1;
    }
    
}
