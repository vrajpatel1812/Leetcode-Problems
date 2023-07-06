package Leetcode;


public class SingleNumber {
    public static void main(String[] args) {
        int[] numms = {2, 2, 1};
        int ans = singleNumber(numms);
        System.out.println(ans);
    }

    public static int singleNumber(int[] nums) {
        int ans = 0;

        for(int i : nums) {
            ans ^= i;
        }

        return ans;
    }
}
