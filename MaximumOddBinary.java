package Leetcode;

public class MaximumOddBinary {
    public static void main(String[] args) {
        String s = "010";
        String ans = maximumOddBinaryNumber(s);
        System.out.println(ans);
    }

    public static String maximumOddBinaryNumber(String s) {
        int countOne = 0;

        for(char i : s.toCharArray()) {
            if (i == '1'){
                countOne++;
            }
        }

        StringBuilder ans = new StringBuilder();
        int size = s.length() - countOne;

        while(countOne > 1) {
            ans.append('1');
            countOne--;
        }

        for(int i = 0; i<size; i++) {
            ans.append('0');
        }

        ans.append('1');
        return ans.toString();
    }
}
