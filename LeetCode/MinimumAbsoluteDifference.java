package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumAbsoluteDifference {
    public static void main(String[] args) {
        int[] arr = {1,3,6,10,15};
        int j = 0;
        Arrays.sort(arr);
        int min =Integer.MAX_VALUE;
        List<List<Integer>> list= new ArrayList<>();

        for(int i =1;i< arr.length;i++){
            min = Math.min(min,arr[i]-arr[i-1]);
        }
  //      System.out.println(min);
        for(int i =1;i< arr.length;i++){
           if(arr[i]-arr[i-1]==min){

                list.add(new ArrayList<Integer>(Arrays.asList(arr[i-1],arr[i])));
           }
        }
        System.out.println(list);
    }
}
