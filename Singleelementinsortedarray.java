package Leetcode;

import java.util.Scanner;

public class Singleelementinsortedarray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] nums = new int[5];
        System.out.println("Array : ");
        for(int i=0; i<5; i++){
            nums[i] = scan.nextInt();
        }
        int ans = singleDulplicate(nums);
        System.out.println("Answer : "+ans);
    }

    public static int singleDulplicate(int[] nums){
        int left = 0, right = nums.length-1;
        while(left < right){
            int mid = left + right >> 1;
            if(mid % 2 == 1){
                mid = mid - 1;
            }
            if(nums[mid] == nums[mid+1]){
                left = mid + 2;
            }else{
                right = mid;
            }
        }
        return nums[left];
    }
}
