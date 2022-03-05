package LeetCode;

import java.util.Arrays;

public class AssignCookies {
    public static void main(String[] args) {

        int[] g = {10,9,8,7};
        int[] s = {5,6,7,8};
        Arrays.sort(g);
        Arrays.sort(s);
        System.out.println(fun(g,s));
    }
    static int fun(int[] g, int[] s){
        int i = 0 ,j =0,ans =0;
        while(i<g.length && j<s.length){
            if(g[i]<=s[j]){
                ans++;
                i++;
                j++;
            }
            else{
                j++;
            }
        }

        return ans;
    }
}
