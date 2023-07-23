package Leetcode;

public class MinimumCommanValue {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3};
        int[] nums2 = {2,4};
        int ans = getCommon(nums1, nums2);
        System.out.println(ans);
    }

    public static int getCommon(int[] nums1, int[] nums2) {
        int i = 0, j = 0;

        while(i < nums1.length && j < nums2.length){
            if(nums1[i] == nums2[j]){
                return nums1[i];
            }

            if(nums1[i] > nums2[j]){
                j++;
            }else{
                i++;
            }
        }

        return -1;
    }
}
