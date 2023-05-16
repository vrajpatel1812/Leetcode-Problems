package Leetcode;

public class MaxProduct {
    public static void main(String[] args) {
        int[] nums = {-1,-2,-3,-4};
        int ans = maximumProduct(nums);
        System.out.println(ans);
    }

    public static int maximumProduct(int[] nums){
        sort(nums);

        int product1 = nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];
        int product2 = nums[1]*nums[0]*nums[nums.length-1];

        if(product1 > product2){
            return product1;
        }
        return product2;
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
