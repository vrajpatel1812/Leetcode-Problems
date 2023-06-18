package Leetcode;

public class HappyNumber {
    public static void main(String[] args) {
        System.out.println(isHappy(2));
    }

    public static boolean isHappy(int n){
        int slow = squard(n);
        int fast = squard(slow);

        while(slow != fast){
            slow = squard(slow);
            fast = squard(squard(fast));
        }

        return slow == 1;
    }

    public static int squard(int n) {
        int ans = 0;

        while(n > 0){
            int temp = n % 10;
            ans = ans + temp*temp;
            n = n / 10;
        }

        return ans;
    }
}
