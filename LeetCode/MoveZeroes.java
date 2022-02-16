package LeetCode;

import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = {0,0,1};
        fun(nums);
        System.out.println(Arrays.toString(nums));
    }
   static void fun(int[] nums){
       for(int i = nums.length-1;i>0;i--){
           int j =i-1;
           if(nums[j] ==0){
               while (j< nums.length-1){
                   swap(nums,j,j+1);
                   j++;
               }
           }
       }
   }
    static void swap(int[] arr, int a ,int b){
        int temp = arr[a];
        arr[a] =arr[b];
        arr[b] =temp;
    }
}
