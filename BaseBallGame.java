package Leetcode;

import java.util.Stack;

public class BaseBallGame{
    public static void main(String[] args) {
        String[] ops = {"5","-2","4","C","D","9","+","+"};
        int ans = calPoints(ops);
        System.out.println(ans);
    }

    public static int calPoints(String[] operations) {
        Stack<Integer> ans = new Stack<>();
        int sum = 0;

        for(String i : operations) {
            if(i.equals("+")) {
                int temp1 = ans.pop();
                int temp2 = ans.pop();
                int temp3 = temp1 + temp2;
                sum += temp3;
                
                ans.push(temp2);
                ans.push(temp1);
                ans.push(temp3);
            }else if(i.equals("C")){
                int temp = ans.pop();
                sum -= temp;
            }else if(i.equals("D")){
                int temp = ans.pop();
                sum += temp*2;
                ans.push(temp);
                ans.push(temp*2);
            }else{
                int value = Integer.parseInt(i);
                sum+=value;
                ans.push(value);
            }
        }

        return sum;
    }
}