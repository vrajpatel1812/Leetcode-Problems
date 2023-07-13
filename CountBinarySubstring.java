package Leetcode;

public class CountBinarySubstring {

    public static void main(String[] args) {
        String s = "00110011";
        int ans = countBinarySubstring(s);
        System.out.println(ans);
    }

    public static int countBinarySubstring(String s) {
        int ans = 0;
        int prev = 0;
        int curr = 1;

        for(int i = 0; i+1<s.length(); i++) {
            if(s.charAt(i) == s.charAt(i+1)){
                curr++;
            }else{
                ans += Math.min(curr, prev);
                prev = curr;
                curr = 1;
            }
        }

        return ans + Math.min(curr, prev);

    }
}
