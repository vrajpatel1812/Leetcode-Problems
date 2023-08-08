package Leetcode;

public class RemoveStars{
    public static void main(String[] args) {
        String s = "*rase*****";
        String ans = removeStars(s);
        System.out.println(ans);
    }

    public static String removeStars(String s){
        StringBuilder sb = new StringBuilder();
        int size = s.length();

        for(int i = 0; i<size; i++){
            if(s.charAt(i) != '*'){
                sb.append(s.charAt(i));            
            }else{
                if(sb.length() == 0){
                    continue;
                }
                sb.deleteCharAt(sb.length()-1);              
            }
        }

        return sb.toString();
    }
}