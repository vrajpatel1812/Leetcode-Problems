package Leetcode;

import java.util.Arrays;

public class SortByParityII {
    public static void main(String[] args) {
        int[] nums = {4,5,2,7};
        int[] ans = sortArrayByParity(nums);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] sortArrayByParity(int[] nums){
        int[] odd = new int[nums.length/2];
        int[] even = new int[nums.length/2];

        int j = 0, k = 0;
        
        for(int i=0; i<nums.length; i++){
            if(nums[i] % 2 == 0){
                even[k] = nums[i];
                k++;
            }else{
                odd[j] = nums[i];
                j++;
            }
        }
        
        j = k = 0;

        for(int i=0; i<nums.length; i++){
            if(i % 2 == 0){
                nums[i] = even[j];
                j++;
            }else{
                nums[i] = odd[k];
                k++;
            }
        }

        return nums;
    }
}
