package Leetcode;

import java.util.Scanner;

public class Largerthantarget {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char[] letters = new char[]{'a', 'c', 'e', 'z'};
        char target = scan.next().charAt(0);
        char ans = nextGreatestletters(letters, target);
        System.out.println(ans);
    }    

    public static char nextGreatestletters(char[] letters, char target){
        for(char c : letters){
            if(c > target){
                return c;
            }
        }
        return letters[0];
    }
}
