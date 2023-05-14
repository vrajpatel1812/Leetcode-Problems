package Leetcode;

import java.net.SocketTimeoutException;
import java.util.Arrays;

public class MergesortedArray {
    public static void main(String[] args) {
        int[] num1 = {0};
        int[] nums = {1};
        merge(num1, 0, nums, 1);
        System.out.println(Arrays.toString(num1));        
    }

    public static void merge(int[] num1, int m, int[] num2, int n){
        int i = m;
        int j = 0;
        
        for(;i<m+n;i++){
            num1[i] = num2[j];
            j++;
        }

        sort(num1);
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
