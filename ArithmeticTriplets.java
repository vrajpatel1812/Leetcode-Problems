package Leetcode;

public class ArithmeticTriplets {
    public static void main(String[] args) {
        int[] nums = {0,1,4,6,7,10};
        int diff = 3;
        int ans = arithmeticTriplets(nums, diff);
        System.out.println(ans);
    }

    public static int arithmeticTriplets(int[] nums, int diff){
        int ans = 0;

        for(int i = 0; i<nums.length-2; i++){
            for(int j = i+1; j<nums.length-1; j++){
                for(int k = j+1; k<nums.length; k++){
                    if(nums[k] - nums[j] == diff && nums[j] - nums[i] == diff){
                        ans++;
                    }
                }
            }
        }    

        return ans;
    }
}
