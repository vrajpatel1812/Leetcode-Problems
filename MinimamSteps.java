package Leetcode;

import java.util.HashMap;

public class MinimamSteps {
    public static void main(String[] args) {
        String s = "bab";
        String t = "aba";
        int ans = minSteps(s, t);
        System.out.println(ans);
    }

    public static int minSteps(String s, String t) {
        int[] ans = new int[26];
        int size = s.length();
        int i;

        for(i = 0; i < size; i++) {
            ans[s.charAt(i) - 'a']++;
            ans[t.charAt(i) - 'a']--;
        }

        int total = 0;
        i = 0;

        while(i < 26) {
            total += Math.max(0, ans[i]);
            i++;
        }

        return total;
    }
}
