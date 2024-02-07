package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagram {
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> ans = grounpAnagrams(strs);
        System.out.println(ans);
    }

    public static List<List<String>> grounpAnagrams(String[] strs) {
        Map<String, List<String>> ans = new HashMap<>();

        for(String i : strs) {
            char[] arr = i.toCharArray();
            Arrays.sort(arr);
            String s = new String(arr);

            if(!ans.containsKey(s)) {
                ans.put(s, new ArrayList<>(List.of(i)));
            }else{
                ans.get(s).add(i);
            }
        }

        return new ArrayList<>(ans.values());
    }
}
