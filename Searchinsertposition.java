package Leetcode;

import java.util.Scanner;

public class Searchinsertposition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter Array :");
        for(int i=0; i<5; i++){
            arr[i] = scan.nextInt();
        }
        System.out.println("Enter Target :");
        int target = scan.nextInt();
        int ans = searchInsert(arr, target);
        System.out.println(ans);
    }
    
    public static int searchInsert(int[] nums, int target){
        int left = 0, right = nums.length - 1;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] > target){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return left;
    }
}
