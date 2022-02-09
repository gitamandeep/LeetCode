package LeetCode;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k =3;
        if (nums == null || nums.length < 2 || nums.length == k || k <= 0 ){
            return;
        }
        if(k>nums.length){
            k = k% nums.length;
        }

            rotate(nums, 0, nums.length - 1);
            rotate(nums, 0, k - 1);
            rotate(nums, k, nums.length - 1);
            System.out.println(Arrays.toString(nums));

    }
    static void rotate(int[] arr, int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            ++start;
            --end;
        }
    }
}
