package Leetcode;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] height = {1,2,1};
        int ans = maxArea(height);
        System.out.println(ans);
    }

    public static int maxArea(int[] height) {
        int i = 0, j = height.length-1;
        int ans = 0;

        while(i < j){
            int width = j - i;
            int hei = Math.min(height[i], height[j]);

            int ar = width*hei;
            if(ar > ans){
                ans = ar;
            }

            if(height[i] < height[j]){
                i++;
            }else{
                j--;
            }
        }

        return ans;
    }

}
