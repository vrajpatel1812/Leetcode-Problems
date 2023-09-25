package Leetcode;

public class ReduceXtoZero {
    public static void main(String[] args) {
        int[] nums = {5, 2, 3, 1, 1};
        int x = 5;
        int ans = minOperations(nums, x);
        System.out.println(ans);
    }

    public static int minOperations(int[] nums, int x) {
        int i = 0, j = nums.length-1;
        int step = 0;


        while(x > 0){
            if(nums[i] > x && nums[j] > x){
                return -1;
            }

            if(nums[i] == nums[j]){
                x = x - nums[i]*2;
                i++;
                j--;
                step++;
            }else if(nums[i] > nums[j] && nums[i] <= x){
                x = x - nums[i];
                i++;
            }else{
                x = x - nums[j];
                j--;
            }

            step++;
        }

        if(x == 0){
            return step;
        }

        return -1;
    }
}
