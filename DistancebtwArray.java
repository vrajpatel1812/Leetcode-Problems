package Leetcode;

import java.util.Arrays;

public class DistancebtwArray {
    public static void main(String[] args) {
        int[] arr1 = {1,4,2,3};
        int[] arr2 = {-4,-3,6,10,20,30};
        int ans = findTheDistanceValue(arr1, arr2, 3);
        System.out.println(ans);
    }

    public static int findTheDistanceValue(int[] arr1, int[] arr2, int d){
        int ans = 0;
        int length1 = arr1.length, length2 = arr2.length;

        for(int i = 0; i<length1; i++){
            int num1 = arr1[i];
            boolean flag = true;
            
            for(int j = 0; j<length2; j++){
                if(Math.abs(num1-arr2[j]) <= d){
                    flag = false;
                    break;
                }
            }

            if(flag == true){
                ans++;
            }
        }

        return ans;
    }
}