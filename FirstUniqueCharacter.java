package Leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class FirstUniqueCharacter {
    public static void main(String[] args) {
        String s = "leetcode";
        int ans = firstUniqChar(s);
        System.out.println(ans);
    }

    public static int firstUniqChar(String s) {
        int ans = Integer.MAX_VALUE;

        for(char i = 'a'; i<='z'; i++) {
            int index = s.indexOf(i);
            if(index != -1 && s.lastIndexOf(i) == index){
                ans = Math.min(ans, index);
            }
        }

        return ans==Integer.MAX_VALUE?-1:ans;
    }


}
