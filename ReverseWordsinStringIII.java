package Leetcode;

public class ReverseWordsinStringIII {
    public static void main(String[] args) {
        String a = "Hello World";
        System.out.println(reverserWords(a));
    }

    public static String reverserWords(String s){
        s = s + " ";
        int i = 0, j = 0;
        String reverse = "";

        for(int a = 0; a < s.length(); a++){
            if(s.charAt(a) == ' '){
                String temp = reverse(s, i, a);
                reverse += temp + " ";
                i = a+1;
            }
        }

        return reverse.substring(0, reverse.length()-1);
    }

    public static String reverse(String s, int i, int j){
        String reverse = "";

        for(int a = j-1; a+1 > i; a--){
            reverse += s.charAt(a);
        }

        return reverse;
    }
}
