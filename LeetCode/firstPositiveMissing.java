package LeetCode;

import java.util.Arrays;

public class firstPositiveMissing {
    public static void main(String[] args) {
        int[] nums = {3,4,-1,5};
        cyclicSort(nums);
        System.out.println(Arrays.toString(nums));
        for(int i =0; i< nums.length;i++){
            if(nums[i] != i+1){
               // return i+1;
                System.out.println(i+1);
                break;
            }
        }
     //   return nums.length +1;

    }
    static void cyclicSort(int arr[]){
        int i =0;
        while(i<arr.length){
            int correct = arr[i]-1;
            if (arr[i]>0 && arr[i]<=arr.length && arr[i]!=arr[correct]  ){
                swap(arr,i,correct);
            }
            else{
                i++;
            }

        }
    }
    static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
