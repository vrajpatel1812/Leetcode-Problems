package Leetcode;

public class RemovePalindromeSubSequence {
    public static void main(String[] args) {
        String s = "ababab";
        int ans = removePalindromeSub(s);
        System.out.println(ans);
    }

    public static int removePalindromeSub(String s) {
        if(s.length() == 0){
            return 0;
        }

        int i = 0;
        int j = s.length()-1;

        while (i < j){
            if(s.charAt(i) == s.charAt(j) && j > -1 && i < s.length()){
                i++;
                j--;
            }else{
                return 2;
            }
        }

        return 1;
    }
}
