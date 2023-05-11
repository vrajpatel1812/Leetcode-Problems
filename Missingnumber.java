package Leetcode;

public class Missingnumber {
    
    public static void main(String[] args) {
        int[] nums = {0,1};
        int ans = missingnumber(nums);
        System.out.println(ans);
    }

    public static int missingnumber(int[] nums){
        sort(nums);
        int left = 0, right = nums.length - 1;

        if(right+1 != nums[right]){
            return right+1;
        }

        while(left < right){
            int mid = right + left >> 1;

            if(nums[mid] == mid){
                left = mid + 1;
            }else{
                right = mid;
            }
        }
        return left;
    }

    public static void sort(int[] nums){
        for(int i=1; i<nums.length; ++i){
            int j = i-1;
            int key = nums[i];
            while(j >= 0 && nums[j] > key){
                nums[j+1] = nums[j];
                j = j - 1;
            }
            nums[j+1] = key;
        }
    }
}
