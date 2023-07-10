package Leetcode;

public class IsSubsequence {
    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgc";
        System.out.println(isSubsequence(s, t)); 
    }

    public static boolean isSubsequence(String s, String t) {
        if(s.isEmpty()){
            return true;
        }

        int i = 0;
        for(char c : t.toCharArray()){
            if(s.charAt(i) == c && ++i == s.length()){
                return true;
            }
        }

        return false;
    }
}
