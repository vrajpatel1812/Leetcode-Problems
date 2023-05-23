package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Pangram {
    public static void main(String[] args) {
        String sentence = "leetcode";
        boolean ans = checkIfPangram(sentence);
        System.out.println(ans);
    }

    public static boolean checkIfPangram(String sentence){
        HashSet<Character> ans = new HashSet<Character>();

        for(char i : sentence.toCharArray()){
            ans.add(i);
        }

        if(ans.size() == 26){
            return true;
        }

        return false;
    }
}
