package LeetCode;

import java.util.ArrayList;

public class findAllDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,3,2};
        ArrayList<Integer> ans = new ArrayList<>();
        cyclicSort(nums);
        for (int i =0;i< nums.length;i++){
            if(nums[i] != i+1){
                ans.add(nums[i]) ;
            }
        }
        System.out.println(ans);
    }
    static void  cyclicSort(int[] arr){
        int i =0;
        while (i<arr.length){
            int correct = arr[i]-1;
            if(arr[i] != arr[correct]){
                swap(arr,i,correct);
            }
            else {
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
