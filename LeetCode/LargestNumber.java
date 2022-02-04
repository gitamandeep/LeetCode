package LeetCode;

import java.util.Arrays;
// Incomplete
public class LargestNumber {
    public static void main(String[] args) {
        //largest number using this number
        int[] nums = {3,30,34,5,9};


        for(int i=0;i< nums.length-1;i++){
            for(int j = i+1;j>0;j--){
                if(nums[j]/decimal(nums[j])>nums[j-1]/decimal(nums[j-1])){
                    swap(nums,j,j-1);
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
    static void swap(int[] arr, int a, int b){
       int temp = arr[a];
       arr[a] = arr[b];
       arr[b] = temp;
    }
    static int decimal(int n){
        return (int)Math.pow(10,(int)Math.log10(n));
    }
}
