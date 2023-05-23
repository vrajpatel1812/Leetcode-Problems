package Leetcode;

public class HighestAltitude {
    public static void main(String[] args) {
        int[] gain = {-4,-3,-2,-1,4,3,2};
        int ans = largestAltitude(gain);
        System.out.println(ans);
    }

    public static int largestAltitude(int[] gain){
        int highest = 0,sum = 0;

        for(int i = 0; i<gain.length; i++){
            sum = sum+gain[i];
            if(sum > highest){
                highest = sum;
            }
        }

        return highest;
    }
}
