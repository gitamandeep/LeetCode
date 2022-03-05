package LeetCode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class RankTransformArray {
    public static void main(String[] args) {
    int[] arr = {40,10,20,30};
    int[] ans = new int[arr.length];
        for(int i =0;i<arr.length;i++){
            ans[i] = arr[i];
        }
        Arrays.sort(arr);
        ArrayList<Integer> ar = new ArrayList<>();
        if(arr.length>0){  //because it giving warning in leetcode
        ar.add(arr[0]);}
        for(int i =1;i<arr.length;i++){
            if(ar.get(ar.size()-1)!=arr[i]){
                ar.add(arr[i]);
            }
        }
       int[] list = new int[ar.size()];
        for(int i =0;i<list.length;i++){
            list[i] = ar.get(i);
        }
      //  System.out.println(Arrays.toString(list));
      //  System.out.println(Arrays.toString(ans));
        for(int i =0;i<ans.length;i++){
            ans[i] =  func(list,ans[i], 0, list.length-1 ) +1;
        }
        System.out.println(Arrays.toString(ans));

    }
    static int func(int[] arr,int target,int start,int end){
        if(start>end){
            return -1;
        }
        else if(arr[(start+end)/2]==target){
            return (start+end)/2;
        }
        else if (arr[(start+end)/2]>target){
            return func( arr, target,start, ((start+end)/2)-1);
        }
        else if (arr[(start+end)/2]<target){
            return func( arr, target,((start+end)/2)+1, end);
        }
        return -1;
    }
}
