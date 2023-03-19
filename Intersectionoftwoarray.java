package Leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;


public class Intersectionoftwoarray {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 5, 6};
        int[] b = new int[]{2, 3, 5, 9};
        int[] ans = intersection(a, b);
        System.out.println(Arrays.toString(ans));        
    }

    public static int[] intersection(int[] nums1, int[] nums2){
        HashSet<Integer> a1 = new HashSet<>();
        for(int i=0; i<nums1.length; i++){
            a1.add(nums1[i]);
        }
        HashSet<Integer> a2 = new HashSet<>();
        for(int i=0; i<nums2.length; i++){
            if(a1.contains(nums2[i])){
                a2.add(nums2[i]);
            }
        }
        int[] ans = new int[a2.size()];
        int i = 0;
        for(Integer j : a2){
            ans[i] = j;
            i++;
        }
        return ans;
    }
}
