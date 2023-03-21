package Leetcode;

import java.util.Scanner;

public class Searchinroteted {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] nums = new int[5];
        System.out.println("Array :");
        for(int i=0; i<5; i++){
            nums[i] = scan.nextInt();
        }
        System.out.println("Target :");
        int target = scan.nextInt();
        int ans = search(nums, target);
        System.out.println("Answer : "+ ans);
    }

    public static int search(int[] nums, int target){
        int high = pivot(nums);
        if(high == -1){
            return binarysearch(nums, target, 0, nums.length-1);
        }
        if(nums[high] == target){
            return high;
        }
        if(nums[0] <= target){
            return binarysearch(nums, target, 0, high-1);
        }
        return binarysearch(nums, target, high+1, nums.length-1);
    }

    public static int binarysearch(int[] nums, int target, int left, int right){
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

    public static int pivot(int[] nums){
        int left = 0, right = nums.length-1;
        while(left <= right){
            int mid = left + right >> 1;
            if(mid < right && nums[mid] > nums[mid + 1]){
                return mid;
            }
            if(mid > left && nums[mid] < nums[mid - 1]){
                return mid-1;
            }

            if(nums[mid] <= nums[left]){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return -1;
    }
}
