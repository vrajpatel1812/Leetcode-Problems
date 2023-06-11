package Leetcode;

public class MaximumSubSequence {
    public static void main(String[] args) {
        String sequence = "aaabaaaabaaabaaaabaaaabaaaabaaaaba";
        String word = "aaaba";
        System.out.println(maxRepeating(sequence, word));
    }

    public static int maxRepeating(String sequence, String word){
        int ans = 0;
        String sub = word;

        while(sequence.contains(sub)){
            ans++;
            sub += word;
        }

        return ans;
    }   
}
