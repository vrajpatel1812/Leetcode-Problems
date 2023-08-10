package Leetcode;

public class SearchInRotatedArrayII {
    public static void main(String[] args) {
        int[] nums = {1,1,1,1,1,1,1,1,1,1,1,1,1,2,1,1,1,1,1};
        System.out.println(search(nums, 2));
    }

    public static boolean search(int[] nums, int target) {
        int left = 0, right = nums.length-1;

        while(left <= right){
            int mid = left + right >> 1;

            if(nums[mid] == target){
                return true;
            }

            if(nums[left] == nums[mid] && nums[right] == nums[mid]){
                left++;
                right--;
                continue;
            }

            if(nums[left] <= nums[mid]){
                if(nums[left] <= target && nums[mid] >= target){
                    right = mid-1;
                }else{
                    left = mid+1;
                }
            }else{
                if(nums[right] >= target && nums[mid] <= target){
                    left = mid+1;
                }else{
                    right = mid-1;
                }
            }
        }

        return false;
    }
}
