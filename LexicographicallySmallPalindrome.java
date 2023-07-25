package Leetcode;

public class LexicographicallySmallPalindrome {
    public static void main(String[] args) {
        String a = "seven";
        String ans = makesmallestPalindrome(a);
        System.out.println(ans);
    }

    public static String makesmallestPalindrome(String s) {
        StringBuilder sb = new StringBuilder(s);
        int i = 0, j = s.length()-1;

        while(i < j){
            if(sb.charAt(i) != sb.charAt(j)){
                if(sb.charAt(i) > sb.charAt(j)){
                    sb.setCharAt(i, sb.charAt(j));
                }else{
                    sb.setCharAt(j, sb.charAt(i));

                }
            }
            i++;
            j--;
        }

        return sb.toString();
    }
}
