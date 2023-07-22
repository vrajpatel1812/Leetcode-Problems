package Leetcode;

import java.util.Stack;

public class BackspaceStringcompare {
    public static void main(String[] args) {
        String s = "y#fo##f"; 
        String t = "y#f#o##f";
        System.out.println(backspaceCompare(s, t));
    }

    public static boolean backspaceCompare(String s, String t) {
        Stack<Character> s1 = new Stack<>();
        Stack<Character> s2 = new Stack<>();

        for(char a : s.toCharArray()){
            if(Character.isAlphabetic(a)){
                s1.push(a);
            }else if(a == '#' && !s1.empty()){
                s1.pop();
            }
        }

        System.out.println(s1);

        for(char a : t.toCharArray()){
            if(Character.isAlphabetic(a)){
                s2.push(a);
            }else if(a == '#' && !s2.empty()){
                s2.pop();
            }
        }

        System.out.println(s2);

        return s1.equals(s2);
    }
}
