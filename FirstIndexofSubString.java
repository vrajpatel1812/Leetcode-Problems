package Leetcode;

public class FirstIndexofSubString {
    public static void main(String[] args) {
        String hayStack = "mississippi";
        String needle = "issip";
        int result = strStr(hayStack, needle);
        System.out.println(result);
    }

    public static int strStr(String haystack, String needle){    
        int i = haystack.length();
        int j = needle.length();

        for(int a = 0; a < i - j + 1; a++){
            if(haystack.substring(a, a + j).equals(needle)){
                return a;
            }
        }

        return -1;
    }
}
