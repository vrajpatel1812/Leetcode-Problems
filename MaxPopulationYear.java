package Leetcode;

public class MaxPopulationYear {
    public static void main(String[] args) {
        int[][] logs = {{1950, 1961}, {1960, 1971}, {1970, 1981}};
        int max = maximumPopulation(logs);
        System.out.println(max);
    }

    public static int maximumPopulation(int[][] logs){
        int[] count = new int[101];

        for(int i = 0; i<logs.length; i++){

            int start = logs[i][0];
            int end = logs[i][1];

            for(int j = start - 1950; j < end - 1950; j++){
                count[j]++;
            }
        }

        int ans = -1;
        int year = -1;

        for(int i = 0; i<101; i++){
            if(count[i] > ans){
                ans = count[i];
                year = i;
            }
        }

        return year + 1950;
    }
}
