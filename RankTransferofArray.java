package Leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RankTransferofArray {
    public static void main(String[] args) {
        int[] arr = {20, 10, 40, 30};
        int[] rank = arrayRankTransform(arr);
        System.out.println(Arrays.toString(rank));
    }

    public static int[] arrayRankTransform(int[] arr){
        int[] sorted = arr.clone();

        Arrays.sort(sorted);

        Map<Integer, Integer> a = new HashMap<Integer, Integer>();

        for(int i : sorted){
            a.putIfAbsent(i, a.size()+1);
        }

        for(int i = 0; i<arr.length; i++){
            arr[i] = a.get(arr[i]);
        }
        
        return arr; 
    }
}
