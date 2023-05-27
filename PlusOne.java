package Leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class PlusOne {
    public static void main(String[] args) {
        int[] digits = {4, 3, 2, 1};
        int[] ans = pluseOne(digits);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] pluseOne(int[] digits){
        List<Integer> a = addToArrayForm(digits, 1);

        int[] ans = new int[a.size()];
        int j = 0;

        for(Integer i : a){
            ans[j] = i;
            j++;
        }

        return ans;
    }

    public static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ans = new LinkedList<Integer>();

        for(int i = num.length-1; i+1 > 0; i--){
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
