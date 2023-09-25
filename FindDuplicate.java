package Leetcode;

import java.util.HashSet;

public class FindDuplicate {
    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 2, 2};
        int ans = findDuplicate(nums);
        System.out.println(ans);
    }

    public static int findDuplicate(int[] nums){
        HashSet<Integer> a = new HashSet<>();
        int len = nums.length;

        for(int i = 0; i<len; i++){
            if(a.contains(nums[i])){
                return nums[i];
            }
            a.add(nums[i]);
        }

        return 0;
    }
}
