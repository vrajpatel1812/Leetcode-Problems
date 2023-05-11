package Leetcode;

import java.util.LinkedList;
import java.util.List;

public class TargetIndicesAfterSortingArray {
    public static void main(String[] args) {
        int[] nums = {100,1,100};
        List<Integer> a = targetIndices(nums, 100);
        System.out.println(a);
    }

    public static List<Integer> targetIndices(int[] nums, int target) {
        sort(nums);
        List<Integer> a = new LinkedList<Integer>();
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                a.add(i);
            }
        }

        return a;
    }

    public static void sort(int[] nums){
        for(int i=1; i<nums.length; ++i){
            int j = i-1;
            int key = nums[i];
            while(j >= 0 && nums[j] > key){
                nums[j+1] = nums[j];
                j = j - 1;
            }
            nums[j+1] = key;
        }
    }
}
