package Leetcode;

public class ArrayConcateValue {
    public static void main(String[] args) {
        int[] nums = {5,14,13,8,12};
        long ans = findTheArrayConcVal(nums);
        System.out.println(ans);
    }

    public static long findTheArrayConcVal(int[] nums) {
        long ans = 0;

        int i = 0, j = nums.length-1;

        while(i < j){
            String temp = String.valueOf(nums[i]) + String.valueOf(nums[j]);

            ans += Long.valueOf(temp);

            i++;
            j--;
        }

        if(nums.length % 2 != 0){
            ans += nums[nums.length/2];
        }

        return ans;
    }
}
