package Leetcode;

import java.util.Arrays;

public class CloseString {
    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "bca";
        System.out.println(closeString(word1, word2));
    }

    public static boolean closeString(String word1, String word2) {
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        int size1 = word1.length();
        int size2 = word2.length();
        int i;

        for(i = 0; i<size1; i++) {
            freq1[word1.charAt(i) - 'a']++;
        }

        for(i = 0; i<size2; i++) {
            freq2[word2.charAt(i) - 'a']++;
        }

        for(i = 0; i<26; i++) {
            if((freq1[i] == 0 && freq2[i] > 0) || (freq1[i] > 0 && freq2[i] == 0)){
                return false;
            }
        }

        Arrays.sort(freq1);
        Arrays.sort(freq2);

        for(i = 0; i<26; i++) {
            if(freq1[i] != freq2[i]) {
                return false;
            }
        }

        return true;
    }
}
