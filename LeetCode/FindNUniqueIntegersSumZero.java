package LeetCode;

import java.util.Arrays;

public class FindNUniqueIntegersSumZero {
    public static void main(String[] args) {
        int n =4;
        int[] ans = new int[n];
        int num = -n/2;
       for(int i =0;i<n;i++){
           if(n%2==0 && num==0){
               num++;
           }
        ans[i] = num;
        num++;
        }
        System.out.println(Arrays.toString(ans));
    }
}
