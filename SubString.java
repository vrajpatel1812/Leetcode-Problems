package Leetcode;

public class SubString {
    public static void main(String[] args) {
        String[] pattern = {"a", "abc", "bc", "d"};
        int ans = numOfStrings(pattern, "abc");
        System.out.println(ans);
    }

    public static int numOfStrings(String[] patterns, String word){
        int ans = 0;

        for(int i = 0; i<patterns.length; i++){
            if(word.contains(patterns[i])){
                ans++;
            }
        }

        return ans;
    }
}
