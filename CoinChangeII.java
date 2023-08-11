package Leetcode;

public class CoinChangeII {
    public static void main(String[] args) {
        int[] coins = {1, 2, 5};
        int amount = 5;
        int ans = change(amount, coins);
        System.out.println(ans);
    }

    public static int change(int amount, int[] coins) {
        int[] ans = new int[amount+1];
        ans[0] = 1;

        for(int i : coins){
            for(int j = i; j < amount+1; j++){
                ans[j] += ans[j - i];
            }
        }

        return ans[amount];
    }
}
