package Leetcode;


public class FaultyKeyboard {
    public static void main(String[] args) {
        String s = "poiinter";
        String ans = finalString(s);
        System.out.println(ans);
    }

    public static String finalString(String s) {
        StringBuilder ab = new StringBuilder(s);

        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == 'i'){
                String reverse = reverseString(ab.toString(), i);
                System.out.println(reverse);
                ab.replace(0, i+1, reverse);
                System.out.println(ab);
            }
        }
        
        System.out.println(ab);
        String a = "";

        for(int i = 0; i<ab.length(); i++){
            if(ab.charAt(i) != 'i'){
                a += ab.charAt(i);
            }
        }

        return a;
    }

    public static String reverseString(String s, int j) {
        String ans = "";
        for(int i = j; i>=0; i--){
            ans += s.charAt(i);
        }
        return ans;
    }
}
