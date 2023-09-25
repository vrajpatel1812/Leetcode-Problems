package Leetcode;

import java.util.Arrays;

public class FindtheDifference {
    public static void main(String[] args) {
        String s = "abcd";
        String t = "abcde";
        char ans = findthedifference(s, t);
        System.out.println(ans);
    }

    public static char findthedifference(String s, String t) {
        char[] chart = t.toCharArray();
        char[] chars = s.toCharArray();

        int lengths = s.length();
        int lengtht = t.length();

        for (int i = 0; i < lengths; i++) {
            chart[i + 1] += chart[i] - chars[i];
        }
        
        return chart[lengtht - 1];
    }
}
