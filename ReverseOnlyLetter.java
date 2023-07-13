package Leetcode;

public class ReverseOnlyLetter {
    public static void main(String[] args) {
        String s = "7_28]";
        String ans = reverseOnlyLetters(s);
        System.out.println(ans);
    }

    public static String reverseOnlyLetters(String s) {
        if(s.length() < 2){
            return s;
        }

        String ans = "";
        int i = 0;
        int j = s.length()-1;

        while(i < s.length() && j > -1){
            if(Character.isAlphabetic(s.charAt(i))){
                if(!Character.isAlphabetic(s.charAt(j))){
                    j--;
                    continue;
                }
                ans += s.charAt(j);
                i++;
                j--;
            }else{
                ans+=s.charAt(i);
                i++;
            }
        } 

        while(i < s.length() && s.length() != ans.length()){
            ans += s.charAt(i);
            i++;
        }

        while(j > -1 && s.length() != ans.length()){
            ans += s.charAt(j);
            j--;
        }

        return ans;
    }

}
