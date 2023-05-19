package Leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

import programms.jaggedarray;

public class RelativeSortArray {
    public static void main(String[] args) {
        int[] arr1 = {2,21,43,38,0,42,33,7,24,13,12,27,12,24,5,23,29,48,30,31};
        int[] arr2 = {2,42,38,0,43,21};

        int[] ans = relativeSorteArray(arr1, arr2);

        System.out.println(Arrays.toString(ans));
    }

    public static int[] relativeSorteArray(int[] arr1, int[] arr2){
        int[] ans = new int[arr1.length];
        int[] count = new int[1001];
        int i = 0;

        for (int a : arr1)
          ++count[a];

        for (int a : arr2)
          while (count[a]-- > 0)
            ans[i++] = a;

        for (int num = 0; num < 1001; ++num)
          while (count[num]-- > 0)
            ans[i++] = num;

        return ans;
    }

    public static int[] relativeSorteArrayII(int[] arr1, int[] arr2){
        Map<Integer, Integer> a = new HashMap<Integer, Integer>();
        Arrays.sort(arr1);

        for(int i = 0; i< arr1.length; i++){
            if(a.containsKey(arr1[i])){
                int count = a.get(arr1[i]) + 1;
                // a.put(arr1[i], count);
                a.replace(arr1[i], count);
            }
            a.putIfAbsent(arr1[i], 1);
        }

        LinkedList<Integer> ans = new LinkedList<Integer>();

        for(int i = 0; i < arr2.length; i++){
            if(a.containsKey(arr2[i])){
                int count = a.get(arr2[i]);
                a.remove(arr2[i]);
                for(int j = 0; j<count; j++){
                    ans.add(arr2[i]);
                }
            }else{
                ans.add(arr2[i]);
            }
        }

        int[] remain = new int[a.size()];
        int k = 0;

        for(Map.Entry<Integer, Integer> i : a.entrySet()){
            int count = i.getValue();
            for(int j = 0; j<count; j++){
                remain[k] = i.getKey();
                k++;
            }
        }
        
        Arrays.sort(remain);
        
        int[] b = new int[ans.size()+remain.length];
        int j = 0;

        for(Integer i : ans){
            b[j] = i;
            j++;
        }

        for(k = 0; k<remain.length; k++){
            b[j] = remain[k];
            j++;
        }

        return b;
    }
}
