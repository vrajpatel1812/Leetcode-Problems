package Leetcode;

import java.util.Arrays;
import java.util.LinkedList;

public class NumberOFBeams {
    public static void main(String[] args) {
        String[] bank = {"011001","000000","010100","001000"};
        int ans = numberOfBeams(bank);
        System.out.println(ans);
    }

    public static int numberOfBeams(String[] bank) {
        int mainSize = bank.length;
        int subSize = bank[0].length();

        LinkedList<Integer> ans = new LinkedList<Integer>();

        for(int i = 0; i<mainSize; i++) {
            int total = 0;
            for(int j = 0; j < subSize; j++) {
                if(bank[i].charAt(j) == '1') {
                    total++;
                }
            } 
            if(total != 0) {
                ans.add(total);
            }
        }

        int totalBeams = 0;
        int[] beams = new int[ans.size()];
        int j = 0;

        for(int i : ans) {
            beams[j] = i;
            j++;
        }

        for(int i = 0; i<ans.size()-1; i++) {
            totalBeams += beams[i] * beams[i+1];
        }

        return totalBeams;
    }
}
