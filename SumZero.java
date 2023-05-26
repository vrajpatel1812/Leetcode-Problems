package Leetcode;

import java.util.Arrays;

public class SumZero{
    public static void main(String[] args) {
        int[] ans = sumZero(2);
        System.out.println(Arrays.toString(ans)); 
    }

    public static int[] sumZero(int n){
        int[] ans = new int[n];

        if(n % 2 == 0){
            int first = n / 2;
            int i = 0;
            while(n > i){
                if(first == 0){
                    first -= 1;
                    continue;
                }
                ans[i] = first;
                first -= 1;
                i++;
            }

        }else{
            int first = n / 2;
            for(int i = 0; i<n; i++){
                ans[i] = first;
                first -= 1;
            }
        }

        Arrays.sort(ans);

        return ans;
    }
}