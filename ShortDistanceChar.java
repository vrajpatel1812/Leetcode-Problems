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
        int last = 0, next = 0;

        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == c){

            }
        }

        return ans;
    }

    public static void fillUp(int[] ans, int last, int next) {
        for(int i = last; i<next; i++){
            
        }
    }
}
