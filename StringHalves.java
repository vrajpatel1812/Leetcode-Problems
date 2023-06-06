package Leetcode;

import java.util.Set;

public class StringHalves {
    public static void main(String[] args) {
        String s = "book";
        System.out.println(halvesAreAlike(s));
    }

    public static boolean halvesAreAlike(String s){
        int a = vowelCount(s, 0, s.length()/2);
        int b = vowelCount(s, s.length()/2, s.length());
        return a == b;
    }

    public static int vowelCount(String s, int start, int end){
        String vowels = "aeiouAEIOU";
        int ans = 0;

        for(int i = start; i<end; i++){
            if(vowels.indexOf(s.charAt(i)) != -1){
                ans++;
            }
        }

        return ans;
    }
}
