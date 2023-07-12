package Leetcode;

public class ReverseVowel {
    public static void main(String[] args) {
        String s = "Leetcode";
        String ans = reverseVowels(s);
        System.out.println(ans);
    }

    public static String reverseVowels(String s) {
        String vowel = "";

        for(int i = 0; i<s.length(); i++){
            if(vowels(s.charAt(i))){
                vowel += s.charAt(i);
            }
        }
        
        String ans = "";
        int j = vowel.length()-1;
        for(int i = 0; i<s.length(); i++){
            if(vowels(s.charAt(i))){
                ans += vowel.charAt(j);
                j--;
            }else{
                ans += s.charAt(i);
            }
        }

        return ans;
    }

    public static boolean vowels(char ch) {
        if(ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'O' || ch == 'o'|| ch == 'U' || ch == 'u'){
            return true;
        }
        return false;
    }
}
