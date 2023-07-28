package Leetcode;

public class ReverseWordinString {
    public static void main(String[] args) {
        String s = "the sky is blue";
        String ans = reverseWords(s);
        System.out.println(ans);
    }

    public String reverseWords(String s){               //best solution
        StringBuilder sb = new StringBuilder();
        int n = s.length(), last = n;

        for(int i = s.length()-1; i+1>0; i--){
            if(s.charAt(i) == ' '){
                sb.append(s.substring(i, last));
                last = i;
            }
        }

        sb.append(' ' + s.substring(0, last));
        
        return sb.toString().replaceAll("\s+", " ").trim();
    }

    public static String reverseWords(String s){         
        s = reverse(s);

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

        return reverse.substring(0, reverse.length()-1).replaceAll("\s+", " ");
    }

    public static String reverse(String s, int i, int j){
        String reverse = "";

        for(int a = j-1; a+1 > i; a--){
            reverse += s.charAt(a);
        }

        return reverse;
    }

    public static String reverse(String s){
        String reverse = "";
        int i = 0;

        while(s.charAt(i) == ' '){
            i++;
        }

        int j = s.length()-1;
        while(s.charAt(j) == ' '){
            j--;
        }

        for(int a = j; a+1 > i; a--){
            reverse += s.charAt(a);
        }

        return reverse;
    }
}
