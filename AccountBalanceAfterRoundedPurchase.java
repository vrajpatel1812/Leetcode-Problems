package Leetcode;

public class AccountBalanceAfterRoundedPurchase {
    public static void main(String[] args) {
        int purchaseAmount = 1;
        int ans = accountBalanceAfterPurchase(purchaseAmount);
        System.out.println(ans);
    }

    public static int accountBalanceAfterPurchase(int purchaseAmount) {
        int low = 100;
        int ans = 0;

        for (int i = 0; i < 110; i += 10) {
            int temp = Math.abs(i - purchaseAmount);
            if (low >= temp) {
                ans = i;
                low = temp;
            }
        }

        return 100 - ans;
    }
}
