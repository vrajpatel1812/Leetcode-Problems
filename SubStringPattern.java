package Leetcode;

public class SubStringPattern {
    public static void main(String[] args) {
        String s = "aba";
        System.out.println(repeatedSubstringPattern(s));
    }

    public static boolean repeatedSubstringPattern(String s) {
        String sub = s + s; //abaaba
        return sub.substring(1, sub.length() - 1).contains(s); //baaba.contains(s) 
    }
}
