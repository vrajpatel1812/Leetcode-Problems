package Leetcode;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class DisaperNumberinArray {
    public static void main(String[] args) {
        int[] nums = {1, 1};
        List<Integer> ans = findDisapperedNumber(nums);
        System.out.println(ans);
    }

    public static List<Integer> findDisapperedNumber(int[] nums){
        HashSet<Integer> a = new HashSet<Integer>();
        List<Integer> ans = new LinkedList<Integer>();

        for(int i : nums){
            a.add(i);
        }

        for(int i = 1; i<=nums.length; i++){
            if(!a.contains(i)){
                ans.add(i);
            }
        }

        return ans;
    }
}
