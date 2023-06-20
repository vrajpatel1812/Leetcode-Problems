package Leetcode;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElementI {
    public static void main(String[] args) {
        int[] nums1 = {1,3,5,2,4};
        int[] nums2 = {6,5,4,3,2,1,7};
        int[] ans = nextGreaterElement(nums1, nums2);
        System.out.println(Arrays.toString(ans)); 
    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];

        for(int i = 0; i<nums1.length; i++){
            ans[i] = -1;
            for(int j = 0; j<nums2.length-1; j++){
                if(nums1[i] == nums2[j] && nums1[i] < nums2[j+1]) {
                    ans[i] = nums2[j+1];
                    continue;
                }else if(nums1[i] == nums2[j]){
                    int k = j;
                    for(; k<nums2.length; k++){
                        if (nums1[i]<nums2[k]){
                            ans[i] = nums2[k];
                            break;
                        }
                    }
                }
            }
        }

        return ans;
    }
}
