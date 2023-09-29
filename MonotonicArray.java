package Leetcode;

public class MonotonicArray {
    public static void main(String[] args) {
        int[] nums = {1,3,2};
        System.out.println(isMonotonic(nums));
    }

    public static boolean isMonotonic(int[] nums) {
        int size = nums.length;
        
        if(accen(nums)){
            return true;
        }

        if(dessn(nums)){
            return true;
        }

        return false;
    }

    public static boolean accen(int[] nums) {
        int size = nums.length;

        for(int i = 0; i<size-1; i++) {
            if(nums[i] > nums[i+1]){
                return false;
            }
        }

        return true;
    }

    public static boolean dessn(int[] nums) {
        for(int i = nums.length-1; i>0; i--) {
            if(nums[i] > nums[i-1]){
                return false;
            }
        }

        return true;
    }
}
