package Leetcode;

public class LengthofLast {
    public static void main(String[] args) {
        String s = " Hello World  ";
        int ans = lengthOfLastWord(s);
        System.out.println(ans);
    }

    public static int lengthOfLastWord(String s){
        int ans = 0;
        int i = s.length()-1;

        while(s.charAt(i) == ' '){
            i--;
        }


        for(; i+1>0; i--){
            if(s.charAt(i) == ' '){
                break;
            }
            ans++;
        }

        return ans;
    }
}
