package LeetCode;

import java.util.Arrays;

public class RelativeSortArray {
    public static void main(String[] args) {
        int[] arr1 = {2,3,1,3,2,4,6,7,9,2,19};
        int[] arr2 = {2,1,4,3,9,6};
        Arrays.sort(arr1);
        int[] ans = arr1;
        int count = 0;
     for(int j=0;j< arr2.length;j++){
         for(int i=count;i< arr1.length;i++){
             if(arr1[i]==arr2[j]){
                 ans[count] = arr1[i];
                 count++;
             }
         }
     }
        System.out.println(Arrays.toString(ans));
    }
    static void swap (int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
