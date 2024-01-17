package Leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueOccurance {
    public static void main(String[] args) {
        int[] arr = {
                1, 2, 2, 1, 1, 3
        };
        System.out.println(uniqueOccurance(arr));
    }

    public static boolean uniqueOccurance(int[] arr) {
         Map<Integer, Integer> freq = new HashMap<>();
        for (int x : arr) {
            freq.put(x, freq.getOrDefault(x, 0) + 1);
        }

        Set<Integer> s = new HashSet<>();
        for (int x : freq.values()) {
            s.add(x);
        }

        return freq.size() == s.size();
    }
}
