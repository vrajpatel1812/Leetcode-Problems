package Leetcode;

public class SpecialArraywithGreaterThanX {
    public static void main(String[] args) {
        int[] nums = {3,5};
        int ans = specialArray(nums);
        System.out.println(ans);
    }

    public static int specialArray(int[] nums){
        for(int i = 0; i<=nums.length; i++){
            int count = 0;

            for(int j = 0; j<nums.length; j++){
                if(nums[j] >= i){
                    count++;
                }
            }

            if(count == i){
                return i;
            }
        }

        return -1;
    }
}
