package Leetcode;

public class ToLowerCase {
    public static void main(String[] args) {
        String s = "Hello";
        String ans = toLowerCase(s);
        System.out.println(ans);
    }

    public static String toLowerCase(String s){
        char[] a = s.toCharArray();

        for(int i = 0; i<s.length(); i++){
            if(a[i] < 91 && a[i] > 64){
                a[i] += 32;
            }
        }

        return String.copyValueOf(a);
    }
}
