package Leetcode;

public class MincosttoMove {
    public static void main(String[] args) {
        int[] position = {2, 2, 2, 3, 3};
        int ans = minCostToMoveChips(position);
        System.out.println(ans);
    }

    public static int minCostToMoveChips(int[] position) {
        int odd = 0, even = 0;

        for(int chip : position){
            if(chip % 2 == 0){
                even++;
            }else{
                odd++;
            }
        }

        return Math.min(odd, even);
    }
}
