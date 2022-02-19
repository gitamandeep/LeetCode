package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindTheWinnerOfCircularGame {
    public static void main(String[] args) {
    int n = 5, k = 2;
    boolean[] friend = new boolean[n];
        System.out.println(fun(n,k));
    }
    static int fun(int n , int k){
        List<Integer> ans=new ArrayList<>();
        for(int i=1;i<=n;i++){
            ans.add(i);
        }
        int cur = 0;
        while(ans.size()>1){
            cur=(cur+k-1)%ans.size();
            ans.remove(cur);
        }
        return ans.get(0);
    }

}
