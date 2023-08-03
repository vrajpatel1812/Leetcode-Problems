package Leetcode;

import java.util.Arrays;

public class MedianOfTwoSortedArray {
    public static void main(String[] args) {
        int[] nums1 = { 1, 2 };
        int[] nums2 = { 3, 4 };
        double ans = findMedianSortedArray(nums1, nums2);
        System.out.println(ans);
    }

    public static double findMedianSortedArray(int[] nums1, int[] nums2) {
        int n = nums1.length + nums2.length;
        int[] arr = new int[n];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                arr[k] = nums1[i++];
            } else {
                arr[k] = nums2[j++];
            }
            k++;
        }

        while (i < nums1.length) {
            arr[k] = nums1[i];
            i++;
            k++;
        }

        while (j < nums2.length) {
            arr[k] = nums2[j];
            j++;
            k++;
        }

        if (arr.length % 2 == 0) {
            return (double) (arr[n / 2] + arr[n / 2 - 1]) / 2;
        }

        return arr[arr.length / 2];
    }
}
