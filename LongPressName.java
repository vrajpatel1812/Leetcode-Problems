package Leetcode;

public class LongPressName {
    public static void main(String[] args) {
        System.out.println(isLongPressedName("alex", "aaleex"));
    }

    public static boolean isLongPressedName(String name, String typed){
        int j = 0;

        for(int i = 0; i<typed.length(); i++){
            if(name.length() > j && name.charAt(j) == typed.charAt(i)){
                j++;
            }else if(j == 0 || typed.charAt(i) != typed.charAt(i-1)){
                return false;
            }
        }

        return j == name.length();
    }
}
