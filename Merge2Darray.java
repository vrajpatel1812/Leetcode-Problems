package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Merge2Darray {
    public static void main(String[] args) {
        int[][] nums1 = { { 1, 2 }, { 2, 3 }, { 4, 5 } };
        int[][] nums2 = { { 1, 4 }, { 3, 2 }, { 4, 1 } };
        int[][] ans = mergeArrays(nums1, nums2);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(Arrays.toString(ans[i]));
        }
    }

    public static int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        List<int[]> list = new ArrayList<>();

        int i = 0, j = 0;
        int len1 = nums1.length, len2 = nums2.length;

        while(len1 > i && len2 > j) {
            if(nums1[i][0] == nums2[j][0]){
                nums1[i][1] += nums2[j][1];
                list.add(nums1[i]);
                i++;
                j++;
            }else if(nums1[i][0] < nums2[j][0]){
                list.add(nums1[i]);
                i++;
            }else{
                list.add(nums2[j]);
                j++;
            }
        }

        while(len1 > i){
            list.add(nums1[i++]);
        }

        while(len2 > j){
            list.add(nums2[j++]);
        }

        int[][] ans = new int[list.size()][2];

        for(i = 0; i<list.size();i++){
            ans[i] = list.get(i);
        }

        return ans;
    }
}
