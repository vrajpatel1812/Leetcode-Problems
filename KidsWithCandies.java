package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class KidsWithCandies {
    public static void main(String[] args) {
        int[] candies = {12,2,12};
        List<Boolean> ans = kidsWithCandies(candies, 10);
        System.out.println(ans);
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies){
        List<Boolean> ans = new ArrayList<Boolean>();

        int max = 0;

        for(int i = 0; i < candies.length; i++){
            if(max < candies[i]){
                max = candies[i];
            }
        }

        for(int i = 0; i < candies.length; i++){
            if(candies[i] + extraCandies >= max){
                ans.add(true);
            }else{
                ans.add(false);
            }
        }

        return ans;
    }
}
