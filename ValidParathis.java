package Leetcode;

import java.util.Stack;

public class ValidParathis {
    public static void main(String[] args) {
        System.out.println(isValid("]}"));
    }

    public static boolean isValid(String s){
        if(s.length() == 1){
            return false;
        }

        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                stack.push(s.charAt(i));
            }else if(!stack.empty()){
                char first = stack.pop();
                if(s.charAt(i) == ')' && first == '(' || s.charAt(i) == ']' && first == '[' || s.charAt(i) == '}' && first == '{'){
                    continue;
                }else{
                    return false;
                } 
            }else{
                return false;
            }
        }

        return stack.size() == 0;
    }
}
