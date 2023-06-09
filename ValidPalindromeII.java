package Leetcode;

public class ValidPalindromeII {
    public static void main(String[] args) {
        System.out.println(ValidPalindrome("abca"));
    }

    public static boolean ValidPalindrome(String s){
        int i = 0;
        int j = s.length()-1;

        while(i < j){
            if(s.charAt(i) != s.charAt(j)){
                return ValidItis(s, i+1, j) || ValidItis(s, i, j-1);
            }
            i++;
            j--;
        }

        return true;
    }

    public static boolean ValidItis(String s, int i, int j){
        while(i < j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}
