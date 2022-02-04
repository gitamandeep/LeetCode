package LeetCode;

import java.util.Arrays;

public class findDuplicate {
    public static void main(String[] args) {
        int[] nums = {4,1,3,4,2};
        cyclicSort(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void cyclicSort(int[] arr){
        int i =0;
        while(i< arr.length){
           int correct = arr[i]-1;
           if(arr[i] != arr[correct]){
               swap(arr,i,correct);
           }
           else{
               i++;
           }
        }
    }

    static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
