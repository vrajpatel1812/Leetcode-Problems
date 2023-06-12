package Leetcode;

public class CheckoneSegment {
    public static void main(String[] args) {
        System.out.println(checkOneSegment("110"));
    }

    public static boolean checkOneSegment(String s){
        for(int i = 0; i<s.length()-1; i++){
            if(s.charAt(i) != s.charAt(i+1) && s.charAt(i) == '0'){
                return false;
            }
        }

        return true;
    }
}
