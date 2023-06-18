package Leetcode;

public class PowerOfFour {
    public static void main(String[] args) {
        System.out.println(isPowerOfFour(26));
    }

    public static boolean isPowerOfFour(int n) {
        return n > 0 && Integer.bitCount(n) == 1 && (n - 1)%3 == 0;
    }

    public boolean isPowerOfTwo(int n) {
        return n > 0 && Integer.bitCount(n) == 1;
    }
}
