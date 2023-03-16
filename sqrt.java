package Leetcode;
public class sqrt {
    public static void main(String[] args) {
        int a = 8;
        int ans = mySqrt(a);
        System.out.println(ans);
    }
    public static int mySqrt(int x) {
        if(x==0){
            return 0;
        }
        int i=1;
        for(; i<=x/i; i++){ 
            if(x/i == i){  
                return i;
            }
        }
        return i-1;
    }
}
