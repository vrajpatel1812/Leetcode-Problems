package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class SelfDivideNumber {
    public static void main(String[] args) {
        System.out.println(selfDividingNumbers(47, 85));
    }

    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList<>();

        for (int i = left; i < right + 1; i++) {
            if(divide(i)){
                ans.add(i);
            }
        }

        return ans;
    }

    public static Boolean divide(int n) {
        int number = n;
        while (number > 0) {
            int temp = number % 10;
            if(temp == 0){
                return false;
            }
            int temp1 = n % temp;
            if (temp1 != 0) {
                return false;
            }
            number = number / 10;
        }
        return true;
    }
}
