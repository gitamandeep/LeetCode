package LeetCode;

import java.util.Arrays;

public class SpecialArrayWithXElementsGreaterThanEqualX {
    public static void main(String[] args) {
        int[] nums = {3,6,7,7,0};
        Arrays.sort(nums);
        System.out.println(fun(nums));
    }
    static int fun(int[] nums){
      int i = nums.length;
      while(i>0){
          if(i<=nums[nums.length-i] && nums.length-i ==0  ){
              return i;
          }
          if(i<=nums[nums.length-i] && nums.length-i !=0 && i>nums[nums.length-i-1] ){
              return i;
          }
          i--;
      }

      return-1;
    }
    // binary search
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
