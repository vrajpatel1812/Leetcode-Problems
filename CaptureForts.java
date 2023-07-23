package Leetcode;

public class CaptureForts {    
    public static void main(String[] args) {
        int[] forts = {1, 0, 0, -1, 0, 0, 0, 0, 1};
        int ans = captureForts(forts);
        System.out.println(ans);
    }

    public static int captureForts(int[] forts) {
        int ans = 0;

        for(int i = 0, j = 0; i < forts.length; i++){
            if(forts[i] != 0){
                if(forts[i] == -forts[j]){
                    ans = Math.max(ans, i - j - 1);
                }
                j = i;
            }
        }

        return ans;
    }
}
