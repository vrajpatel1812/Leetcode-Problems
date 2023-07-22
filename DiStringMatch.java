package Leetcode;

import java.util.Arrays;

public class DiStringMatch {
    public static void main(String[] args) {
        String s = "IDID";
        int[] ans = diStringMatch(s);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] diStringMatch(String s) {
        int[] ans = new int[s.length()+1];

        int i = 0, j = s.length(), k = 0;

        for(char a : s.toCharArray()){
            if(a == 'I'){
                ans[k] = i;
                i++;
                k++;
            }else{
                ans[k] = j;
                j--;
                k++;
            }
        }

        ans[k] = j;

        return ans;
    }
}
