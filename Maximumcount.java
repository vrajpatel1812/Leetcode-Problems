package Leetcode;

public class Maximumcount {
    public static void main(String[] args) {
        int[] nums = {0};
        int a = maximumCount(nums);
        System.out.println(a);
    }

    public static int maximumCount(int[] nums) {
        int positive = positiveCount(nums);
        int negative = negativeCount(nums);

        if(positive == -1){
            return negative+1;
        }
        
        positive = nums.length - positive;

        if(positive > negative){
            if(positive == 1){
                return 0;
            }
            return positive;
        }else{
            return negative;
        }
    }

    public static int positiveCount(int[] nums){
        int left = 0, right = nums.length-1;

        if(nums[right] <= 0){
            return -1;
        }

        while(left < right){
            int mid = left + right >> 1;

            if(nums[mid] > 0){
                right = mid;
            }
            else{
                left = mid+1;
            }
        }
        return left;
    }

    public static int negativeCount(int[] nums){
        int left = 0, right = nums.length-1;

        if(nums[left] >= 0){
            return -1;
        }

        while(left < right){
            int mid = left + right >> 1;

            if(nums[mid] < 0){
                left = mid+1;
            }
            else{
                right = mid;
            }
        }
        return right;
    }

}
