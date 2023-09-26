package Leetcode;

import java.util.Stack;

public class RemoveDuplicateLetter {
    public static void main(String[] args) {
        String s = "bcabc";
        String ans = removeDuplicateLetters(s);
        System.out.println(ans);
    }

    public static String removeDuplicateLetters(String s){
        Stack<Integer> a = new Stack<>();
        int[] last_appr = new int[26];
        boolean[] visited = new boolean[26];

        for(int i = 0; i<s.length(); i++){
            last_appr[s.charAt(i) - 'a'] = i;
        }

        for(int i = 0; i<s.length(); i++){
            int curr = s.charAt(i) - 'a';

            if(visited[curr] == true){
                continue;   
            }

            while(!a.empty() && curr < a.peek() && i < last_appr[a.peek()]){
                visited[a.pop()] = false;
            }

            a.push(curr);
            visited[curr] = true;
        }

        StringBuilder st = new StringBuilder();

        while(!a.empty()){
            st.append((char) (a.pop() + 'a'));
        }

        return st.reverse().toString();
    }
}
