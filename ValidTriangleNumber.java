package Leetcode;

import java.util.Arrays;

public class ValidTriangleNumber {
    public static void main(String[] args) {
        int[] nums = { 4, 2, 3, 4 };
        int ans = triangleNumber(nums);
        System.out.println(ans);
    }

    public static int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int ans = 0, i, j, k, n = nums.length;

        for (i = 0; i < n; i++) {
            for (j = i + 1, k = j + 1; j < (n - 1) && k <= n;) {
                if (k == n || nums[i] + nums[j] <= nums[k]) {
                    if (k > (j + 1)) {
                        ans += k - j - 1;
                    }
                    j++;
                } else {
                    k++;
                }
            }
        }

        return ans;
    }
}
