package Leetcode;

import java.util.Arrays;
import java.util.Stack;

public class DailyTemperature {
    public static void main(String[] args) {
        int[] temperatures = {73,74,75,71,69,72,76,73};
        int[] ans = dailyTemperature(temperatures);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] dailyTemperature(int[] temperatures) {
        int size = temperatures.length;
        int[] ans = new int[size];
        Stack<Integer> stack = new Stack<>();

        for(int i = size-1; i>=0; i--) {
            if(stack.empty()) {
                stack.push(i);
                ans[i] = 0;
            }else{
                while(!stack.empty() && temperatures[i] >= temperatures[stack.peek()]) {
                    stack.pop();
                }

                if(stack.empty()) {
                    ans[i] = 0;
                }else{
                    ans[i] = stack.peek() - i;
                }

                stack.push(i);
            }
        }

        return ans;
    }
    
}
