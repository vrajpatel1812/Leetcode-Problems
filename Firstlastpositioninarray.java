package Leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class Firstlastpositioninarray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] nums = new int[5];
        System.out.println("Enter an Array:");
        for(int i=0; i<5; i++){
            nums[i] = scan.nextInt();
        }
        System.out.println("Enter a Target:");
        int target = scan.nextInt();
        int[] ans = searchrange(nums, target);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] searchrange(int[] nums, int target){
        int ans = search(nums, target, 0);
        if(ans == nums.length || nums[ans] != target){
            return new int[] {-1, -1};
        }
        return new int[] {ans, search(nums, target+1, ans) - 1};
    }

    public static int search(int[] nums, int target, int left){
        int right = nums.length-1;
        while(left <= right){
            int mid = left + right >> 1;
            if(nums[mid] < target){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return left;
    }
}
