package Leetcode;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length()!=t.length()) {
            return false;
        }

        int[] count = new int[128];

        for(char a : s.toCharArray()){
            ++count[a];
        }

        for(char a : t.toCharArray()){
            if(--count[a] < 0){
                return false;
            }
        }

        return true;
    }
}
