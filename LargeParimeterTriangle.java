package Leetcode;

import java.util.Arrays;

public class LargeParimeterTriangle {
    public static void main(String[] args) {
        int[] nums = {2,1,2};
        int ans = largestPerimeter(nums);
        System.out.println(ans); 
    }

    public static int largestPerimeter(int[] nums){
        Arrays.sort(nums);

        for(int i = nums.length-1; i>=2; --i){
            if(validtriangle(nums[i], nums[i-1], nums[i-2]) == true){
                return nums[i]+nums[i-1]+nums[i-2];
            }
        }

        return 0;

    }

    public static boolean validtriangle(int a, int b, int c){
        if (a + b > c && b + c > a && c + a > b) {
            return true;
        } else {
            return false;
        }
    }
}
