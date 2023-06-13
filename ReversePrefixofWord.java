package Leetcode;

public class ReversePrefixofWord {
    public static void main(String[] args) {
        String word = "abcdefd";
        String ans = reversePrefix(word, 'd');
        System.out.println(ans);
    }

    public static String reversePrefix(String word, char ch){
        String ans = "";

        if(word.indexOf(ch) != -1){
            int index = word.indexOf(ch);
            for(int i = index; i >= 0; i--){
                ans += word.charAt(i);
            }
            ans += word.substring(index+1, word.length());
            return ans;
        }

        return word;
    }
}
