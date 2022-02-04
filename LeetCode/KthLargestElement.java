package LeetCode;

import java.util.Arrays;

public class KthLargestElement {
    public static void main(String[] args) {
        int[] nums = {3,2,1,5,6,4};
        int k = 2;
        InserstionSort(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void InserstionSort(int[] arr){
        for(int i =0;i< arr.length-1;i++){
            for(int j = i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    Swap(arr,j,j-1);
                }
            }
        }
    }
    static void Swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
