package Leetcode;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class ThreeSumCloset {
    public static void main(String[] args) {
        int[] nums = {-1,2,1,-4};
        int ans = threeSumCloset(nums, 1);
        System.out.println(ans);
    }

    public static int threeSumCloset(int[] nums, int target){
        int ans = nums[0] + nums[1] + nums[2];
        
        Arrays.sort(nums);

        for(int i = 0; i<nums.length-2; i++){
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }

            int j = i+1;
            int k = nums.length-1;

            while(j < k){
                int sum = nums[i] + nums[j] + nums[k];

                if(sum == target){
                    return target;
                }

                if(Math.abs(ans - target) > Math.abs(sum - target)){
                    ans = sum;
                }

                if(sum > target){
                    k--;
                }else{
                    j++;
                }
            }
        }

        return ans;
    }
}
