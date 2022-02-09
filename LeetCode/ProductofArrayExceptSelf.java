package LeetCode;

import java.util.Arrays;

public class ProductofArrayExceptSelf {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] ans = new int[nums.length];
        for (int i =0;i< nums.length;i++){
            ans[i] = product(nums,i);
        }
        System.out.println(Arrays.toString(ans));
    }
    static int product(int[] arr,int a){
        int prod =1;
        for (int i =0;i< arr.length;i++){
            if(i==a){
                continue;
            }
            prod = prod*arr[i];
        }
        return prod;
    }
}
