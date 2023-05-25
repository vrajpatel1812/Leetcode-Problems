package Leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AddtoArray {
    public static void main(String[] args) {
        int[] num = {9,9,9,9,9,9,9,9,9,9};
        List<Integer> ans = addToArrayForm(num, 1);
        System.out.println(ans);
    }

    public static List<Integer> addToArrayForm(int[] num, int k){
        List<Integer> ans = new LinkedList<Integer>();

        for(int i = num.length-1; i+1>0; i--){
            ans.add(0, (num[i] + k) % 10);
            k = (k + num[i]) / 10;
        }

        while(k > 0){
            ans.add(0, k % 10);
            k /= 10;
        }

        return ans;
    }
}

// num = [1, 2, 0, 0], k = 34            

// i = 3
// 0 + 34 = 34 % 10 = 4
// k = 34 + 0 = 34 / 10 = 3

// i = 2
// 0 + 3 = 3 % 10 = 3
// k = 3 + 0 = 3 / 10 = 0

// i = 1
// 0 + 2 = 2 % 10 = 2
// k = 2 + 0 = 2 / 10 = 0

// i = 0
// 0 + 1 = 1 % 10 = 1
// k = 0 + 1 = 1 / 10 = 0
