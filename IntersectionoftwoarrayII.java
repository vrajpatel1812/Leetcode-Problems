package Leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class IntersectionoftwoarrayII {
    public static void main(String[] args) {
        int[] a = new int[]{1,2,2,1};
        int[] b = new int[]{2,2};
        int[] ans = intersection(a, b);
        System.out.println(Arrays.toString(ans));        
    }

    public static int[] intersection(int[] nums1, int[] nums2){
        sort(nums1);
        sort(nums2);

        int i = 0, j = 0;
        List<Integer> a = new LinkedList<Integer>();

        while(nums1.length > i && nums2.length > j){
            if(nums1[i] < nums2[j]){  
                i++;
            }else if(nums1[i] > nums2[j]){
                j++;
            }else{
                a.add(nums1[i]);
                i++;
                j++;
            }
        }

        int[] ans = new int[a.size()];
        int z = 0;

        for(Integer k : a){
            ans[z] = k;
            z++;
        }

        return ans;
    }

    public static void sort(int[] a){
        for(int i=1; i<a.length; ++i){
            int j = i-1;
            int key = a[i];
            while(j >= 0 && a[j] > key){
                a[j+1] = a[j];
                j = j - 1;
            }
            a[j+1] = key;
        }
    }
}
