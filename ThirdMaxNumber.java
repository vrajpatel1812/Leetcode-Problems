package Leetcode;


public class ThirdMaxNumber {
    public static void main(String[] args) {
        int[] nums = {2,1,2};
        int thirdmax = thirdMax(nums);
        System.out.println(thirdmax);
    }

    public static int thirdMax(int[] nums){
        sort(nums);
        int max = nums[nums.length-1] , j = 0;

        for(int i = nums.length - 2; i >= 0; --i){
            if(max > nums[i]){
                max = nums[i];
                j++;
            }
            if(j == 2){
                return max;
            }
        }

        return nums[nums.length-1];
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
