package Leetcode;

public class TwoString {
    public static void main(String[] args) {
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};
        System.out.println(arrayStringsAreEqual(word1, word2));
    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2){
        String a = " ";
        String b = " ";

        for(String i : word1){
            a = a + i;
        }

        for(String j : word2){
            b = b + j;
        }

        if(a.equals(b)){
            return true;
        }

        return false;
    }
}
