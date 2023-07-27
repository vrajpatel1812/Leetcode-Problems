package Leetcode;

import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void sortColors(int[] nums) {
        quick_sort(nums, 0, nums.length-1);
    }

    public static void quick_sort(int[] arr, int low, int high){
        if(low < high){
            int pidx = partition(arr, low, high);

            quick_sort(arr, low, pidx-1);
            quick_sort(arr, pidx+1, high);
        }
    }

    public static int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = low-1;

        for(int j=low; j<high; j++){
            if(arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        
        return i;
    }
}
