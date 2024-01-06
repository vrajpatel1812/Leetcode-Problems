package Leetcode;

import java.util.Arrays;
import java.util.Comparator;

public class JobScheduleing {
    public static void main(String[] args) {
        int[] startTime = {1,2,3,4,6};
        int[] endTime = {3,5,10,6,9};
        int[] profit = {20,20,100,70,60};
        int ans = jobScheduling(startTime, endTime, profit);
        System.out.println(ans);
    }

    public static int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        int numJobs = profit.length;
        Job[] jobs = new Job[numJobs];

        for (int i = 0; i < numJobs; ++i) {
            jobs[i] = new Job(endTime[i], startTime[i], profit[i]);
        }

        Arrays.sort(jobs, Comparator.comparingInt(job -> job.endTime));
        int[] dp = new int[numJobs + 1];

        for (int i = 0; i < numJobs; ++i) {
            int endTimeValue = jobs[i].endTime;
            int startTimeValue = jobs[i].startTime;
            int profitValue = jobs[i].profit;

            int latestNonConflictJobIndex = upperBound(jobs, i, startTimeValue);
            dp[i + 1] = Math.max(dp[i], dp[latestNonConflictJobIndex] + profitValue);
        }

        return dp[numJobs];
    }

    private static int upperBound(Job[] jobs, int i, int startTimeValue) {
        int low = 0;
        int high = i;

        while (low < high) {
            int mid = (low + high) / 2;
            if (jobs[mid].endTime <= startTimeValue) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return low;
    }

    private static class Job {
        int endTime;
        int startTime;
        int profit;

        public Job(int endTime, int startTime, int profit) {
            this.endTime = endTime;
            this.startTime = startTime;
            this.profit = profit;
        }
    }
} 