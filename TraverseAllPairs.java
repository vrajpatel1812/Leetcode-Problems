package Leetcode;

public class TraverseAllPairs {
    public static void main(String[] args) {
        int[] nums = {2, 3, 6};
        System.out.println(canTraverseAllPairs(nums));
    }

    public static boolean canTraverseAllPairs(int[] nums) {
        int c = gcd(nums[0], nums[1]);
        System.out.println(c);
        return true;
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }

}
