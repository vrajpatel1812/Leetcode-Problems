package Leetcode;

public class AssignCookies {
    public static void main(String[] args) {
        int[] g = {7,8,9,10};
        int[] s = {5,6,7,8};
        int ans = findContentChildreanI(g, s);
        System.out.println(ans);
    }

    public static int findContentChildreanI(int[] g, int[] s){
        sort(g);
        sort(s);

        int i = 0, j = 0, ans = 0;

        while(i < g.length && j < s.length){
            if(g[i] == s[j] || g[i] <= s[j]){
                i++;
                j++;
                ans++;
            }else{
                j++;
            }
        }

        return ans;
    }

    public static void sort(int[] a){
        for(int i=1; i<a.length; ++i){
            int j = i-1;
            int key = a[i];
            while(j >= 0 && a[j] > key){
                a[j+1] = a[j];
                j = j - 1;
            }
            a[j+1] = key;
        }
    }
}
