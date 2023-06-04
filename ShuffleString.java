package Leetcode;

public class ShuffleString {
    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = {4,5,6,7,0,1,2,3};
        String a = restoreString(s, indices);
        System.out.println(a);
    }

    public static String restoreString(String s, int[] indices){
        char[] a = new char[s.length()];

        for(int i = 0; i<s.length(); i++){
            a[indices[i]] = s.charAt(i);
        }

        return String.copyValueOf(a);
    }
}
