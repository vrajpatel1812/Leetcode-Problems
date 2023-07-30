package Leetcode;

import java.util.Arrays;

public class StringCompression {
    public static void main(String[] args) {
        char[] chars = {'a','b','c'};
        int ans = compress(chars);
        System.out.println(ans);
    }

    public static int compress(char[] chars) {
        if(chars.length < 2){
            return chars.length;
        }

        String ans = "";

        int count = 1;
        char prev = chars[0];
        int i = 1;

        for(; i<chars.length; i++) {
            if(prev == chars[i]){
                count++;
            }else{
                if(count == 1){
                    ans += prev;
                    prev = chars[i];
                    count = 1;
                    continue;
                }
                ans += prev + String.valueOf(count);
                prev=chars[i];
                count=1;
            }
        }

        if(count > 1){
            ans += prev + String.valueOf(count);
        }else{
            ans += prev;
        }

        System.out.println(ans);

        for(int j = 0; j<ans.length(); j++){
            chars[j] = (char)(ans.charAt(j));
        }

        return ans.length();
    }
}
