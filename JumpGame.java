package Leetcode;

public class JumpGame {
    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 1, 4};
        System.out.println(canJump(nums));
    }
    

    public static boolean canJump(int[] nums) {
        int reach = 0;

        for(int i = 0; i<nums.length; i++){
            if(reach < i){
                return false;
            }

            // reach = Math.max(reach, i+nums[i]);

        }


        return true;
    }
}
