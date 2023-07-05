package Leetcode;

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        int ans = removeElement(nums, val);
        System.out.println(ans);
    }

    public static int removeElement(int[] nums, int val) {
        int ans = 0;
        int j = 0;

        for(int i : nums){
            if(i == val){
                continue;
            }
            nums[j] = i;
            j++;
            ans++;
        }

        return ans;
    }
}
