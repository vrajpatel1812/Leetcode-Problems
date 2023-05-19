package Leetcode;

public class MaxProductofTwo {
    public static void main(String[] args) {
        int[] nums = {3,4,5,2};
        int ans = maxPorduct(nums);
        System.out.println(ans); 
    }

    public static int maxPorduct(int[] nums){
        int maxProduct = 0;

        for(int i = 0; i<nums.length; i++){
            for(int j = i+1; j<nums.length; j++){
                if(i == j){
                    continue;
                }
                
                if(maxProduct < (nums[i]-1) * (nums[j]-1)){
                    maxProduct = (nums[i]-1) * (nums[j]-1);
                }
            }
        }

        return maxProduct;
    }
}
