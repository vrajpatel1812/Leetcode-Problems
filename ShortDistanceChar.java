package Leetcode;

import java.util.Arrays;

public class ShortDistanceChar {
    public static void main(String[] args) {
        String s = "loveleetcode";
        int[] ans = ShortToChar(s, 'e');
        System.out.println(Arrays.toString(ans));
    }

    public static int[] ShortToChar(String s, char c) {
        int[] ans = new int[s.length()];
        int len = s.length();
        int prev = len;

        for(int i = 0; i<len; i++){
            if(s.charAt(i) == c){
                ans[i] = 0;
                prev = 0;
            }else{
                ans[i] = ++prev;
            }
        }

        prev = len;
        for(int i = len-1; i>=0; i--){
            if(s.charAt(i) == c){
                prev = 0;
                continue;
            }else{
                ans[i] = Math.min(ans[i], ++prev);
            }
        }

        return ans;
    }
}
