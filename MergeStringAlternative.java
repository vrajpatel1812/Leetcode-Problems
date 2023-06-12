package Leetcode;

public class MergeStringAlternative {
    public static void main(String[] args) {
        String word1 = "abcd";
        String word2 = "pq";
        String ans = mergeAlternately(word1, word2);
        System.out.println(ans);
    }

    public static String mergeAlternately(String word1, String word2){
        String ans = "";

        int i = 0, j = 0;

        while(i < word1.length() && j < word2.length()){
            ans += word1.charAt(i);
            i++;
            ans += word2.charAt(j);
            j++;
        }

        if(i < word1.length()){
            while(i < word1.length()){
                ans += word1.charAt(i);
                i++;
            }
        }

        if(j < word2.length()){
            while(j < word2.length()){
                ans += word2.charAt(j);
                j++;
            }
        }

        return ans;
    }
}
