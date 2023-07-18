package Leetcode;

public class ReverseStringII {
    public static void main(String[] args) {
        String s = "abcdefg";
        String ans = reverseStr(s, 2);
        System.out.println(ans);
    }

    public static String reverseStr(String s, int k) {
        StringBuilder str = new StringBuilder(s);
        
        for(int i = 0; i<str.length(); i+=2*k){
            int l = i;
            int r = Math.min(i+k-1, str.length()-1);

            while(l < r){
                str.setCharAt(l, s.charAt(r));
                str.setCharAt(r, s.charAt(l));
                l++;
                r--;
            }
        }

        return str.toString();
    }
}
