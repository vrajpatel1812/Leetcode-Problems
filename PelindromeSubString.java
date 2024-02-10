package Leetcode;

import java.util.Arrays;

public class PelindromeSubString {
    public static void main(String[] args) {
        String s = "abcddcba";
        int ans = countSubstrings(s);
        System.out.println(ans);
    }

    public static int size;
    public static char[] sChar;

    public static int countSubstrings(String s) {
        size = s.length();
        sChar = s.toCharArray();
        int ans = 0;
        
        for(int i = 0; i<size; i++){
            ans+=isPalindrome(s, i, i);
            ans+=isPalindrome(s, i, i+1);
        }

        return ans;
    }

    public static int isPalindrome(String s, int left, int right) {
        int ans = 0;

        while (left >= 0 && right < size) {
            if(sChar[left--] == sChar[right++]){
                ans++;
            }else{
                break;
            }
        }

        return ans;
    }
}
