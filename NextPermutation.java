package Leetcode;

import java.util.Arrays;

public class NextPermutation {
    public static void main(String[] args) {
        int[] nums = {1,3,2};
        nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void nextPermutation(int[] nums) {
        int temp1 = -1;
        int temp2 = -1;
        
        for(int i = nums.length-2; i+1>0; i--){
            if(nums[i] < nums[i+1]){
                temp1 = i;
                break;
            }
        }

        if(temp1 == -1){
            Arrays.sort(nums);
        }else{
            for(int i = nums.length-1; i+1>0; i--){
                if(nums[i] > nums[temp1]){
                    temp2 = i;
                    break;
                }
            }
            swap(nums, temp1, temp2);
            reverse(nums, temp1+1);
        }
    }

    public static void swap(int[] nums, int num1, int num2){
        int temp = nums[num1];
        nums[num1] = nums[num2];
        nums[num2] = temp;
    }

    public static void reverse(int[] nums, int start){
        int i = start;
        int j = nums.length-1;
        while(i<j){
            swap(nums, i, j);
            i++;
            j--;
        }
    }
}