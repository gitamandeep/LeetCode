package dsaNotes;

import java.util.ArrayList;
import java.util.Arrays;

public class dissapearedArray {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        ArrayList<Integer> ans = new ArrayList<Integer>();
        cyclicSort(nums);

        for(int correct =0;correct < nums.length; correct++){
            if (nums[correct] != correct +1) {
                ans.add(correct+1);
            }
        }
        System.out.println(ans);
    }

    static void cyclicSort(int arr[]){
        int i =0;
        while(i<arr.length){
            int correct = arr[i]-1;
            if (arr[i]<=arr.length && arr[i]!=arr[correct] ){
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
