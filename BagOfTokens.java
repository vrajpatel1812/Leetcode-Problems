package Leetcode;

import java.util.Arrays;

public class BagOfTokens {
    public static void main(String[] args) {
        int[] tokens = { 71,55,82 };
        int ans = bagOfTokenScore(tokens, 54);
        System.out.println(ans);
    }

    public static int bagOfTokenScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int j = tokens.length - 1, i = 0;
        int score = 0, max = 0;

        if(tokens.length == 0 || tokens[i] > power ) {
            return 0;
        }

        while (i <= j) {
            if (power >= tokens[i]) {
                power -= tokens[i];
                score++;
                i++;
                // System.out.println("PowerUP");
            } else {
                power += tokens[j];
                score--;
                j--;
                // System.out.println("PowerDown");
            }

            if(max < score) {
                max = score;
            }
            // System.out.println(power);
        }

        return max;
    }
}
