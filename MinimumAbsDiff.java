package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumAbsDiff {
    public static void main(String[] args) {
        int[] arr = {3,8,-10,23,19,-4,-14,27};
        List<List<Integer>> ans = minimumAbsDifference(arr);
        System.out.println(ans);
    }

    public static List<List<Integer>> minimumAbsDifference(int[] arr){
        Arrays.sort(arr);

        int absmini = arr[arr.length-1];

        for(int i = 0; i < arr.length-1; i++){
            if(arr[i+1] - arr[i] < absmini){
                absmini = arr[i+1] - arr[i];
            }
        }

        List<List<Integer>> ans = new ArrayList<>();

        for(int i = 0; i < arr.length-1; i++){
            if(arr[i+1] - arr[i] == absmini){
                ans.add(Arrays.asList(arr[i], arr[i+1]));
            }
        }

        return ans;
    }
}
