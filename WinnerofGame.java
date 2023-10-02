package Leetcode;

public class WinnerofGame {
    public static void main(String[] args) {
        String colors = "BBAA";
        System.out.println(winnerofGameII(colors));
    }

    public static boolean winnerofGameI(String colors) {
        int size = colors.length();

        if(size < 3){
            return false;
        }

        int total_alice = 0, total_bob = 0;
        char prev = colors.charAt(0);

        for(int i = 1; i < size-1; i++){
            if(prev == colors.charAt(i) && colors.charAt(i) == colors.charAt(i+1) && colors.charAt(i) == 'A'){
                total_alice++;
            }

            if(prev == colors.charAt(i) && colors.charAt(i) == colors.charAt(i+1) && colors.charAt(i) == 'B'){
                total_bob++;
            }

            prev = colors.charAt(i);
        }

        return total_alice > total_bob;
    }

    public static boolean winnerofGameII(String colors) {
        int total_alice = 0, total_bob = 0, count = 0;
        
        for (int i = 1; i < colors.length(); i++) {
            if (colors.charAt(i) == colors.charAt(i - 1)) {
                count++;
            } else if(count > 1){
                if (colors.charAt(i - 1) == 'A') {
                    total_alice += count - 1;
                } else {
                    total_bob +=  count - 1;
                }
                count = 0;
            }else{
                count = 0;
            }
        }

        if (colors.charAt(colors.length() - 1) == 'A') {
            total_alice += Math.max(0, count - 1);
        } else {
            total_bob += Math.max(0, count - 1);
        }
        
        return total_alice > total_bob;
    }
}
