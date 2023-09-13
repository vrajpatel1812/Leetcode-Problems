package Leetcode;

import java.util.Arrays;

public class Candy {
    public static void main(String[] args) {
        int[] rating = {1, 0, 2};
        int ans = candy(rating);
        System.out.println(ans);
    }

    public static int candy(int[] ratings) {
        int n = ratings.length;
        int[] kandy = new int[n];
        Arrays.fill(kandy, 1);

        for(int i = 1; i<n; i++){
            if(ratings[i-1] < ratings[i]){
                kandy[i] = kandy[i-1] + 1;
            }
        }

        for(int i = n-2; i>=0; i--){
            if(ratings[i] > ratings[i+1]){
                kandy[i] = Math.max(kandy[i+1] + 1, kandy[i]);
            }
        }

        int ans = 0;

        for(int i : kandy){
            ans += i;
        }

        return ans;
    }
}
