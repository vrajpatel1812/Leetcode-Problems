package Leetcode;

public class MinimumLength {
    public static void main(String[] args) {
        String s = "cabaabac";
        int ans = minimumLength(s);
        System.out.println(ans);
    }

    public static int minimumLength(String s) {
        int i = 0, j = s.length() - 1;
        char[] sChar = s.toCharArray();

        while (i < j && sChar[i] == sChar[j]) {
            char match = sChar[i];

            while (i <= j && sChar[i] == match) {
                i++;
            }

            while (i <= j && sChar[j] == match) {
                j--;
            }
        }

        return (i > j) ? 0 : j - i + 1;
    }
}
