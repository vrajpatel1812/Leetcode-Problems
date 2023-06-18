package Leetcode;

public class JumpGame {
    public static void main(String[] args) {
        System.out.println(canReach("0000000000", 2, 5));
    }

    public static boolean canReach(String s, int minJump, int maxJump) {
        int size = s.length(), i = 0;
        while(i < size-1){
            while(s.charAt(i) != '0' && size > i){
                i++;
                if(s.charAt(i) != '0' && i == size-1){
                    return false;
                }
            }

            int j = i+1;

            while(s.charAt(j) != '0' && size > j){
                j++;
                if(size == j){
                    return false;
                }
            }

            if(i + minJump <= j && j <= Math.min(i+maxJump, size-1) && s.charAt(j) == '0'){
                i = j;
            }else{
                return false;
            }
        }

        return i == size-1;
    }
}
