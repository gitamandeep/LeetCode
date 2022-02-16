package LeetCode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MakeTwoArraysEqualReversingSubarrays {
    public static void main(String[] args) {
        int[] target = {1,2,3,4};
        int[] arr = {2,4,1,3};
        Arrays.sort(target);
        Arrays.sort(arr);
        for(int i =0; i<arr.length;i++){
            if(target[i]!=arr[i]){
                System.out.println(false);
            }

        }
    }
}
