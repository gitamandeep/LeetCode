package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;

public class ThirdMaximumNumber {
    public static void main(String[] args) {
        int[] nums = {2,1};
        Arrays.sort(nums);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(nums[0]);
        for(int i =1; i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                list.add(nums[i]);
            }
        }
     //   System.out.println(list);
        if(list.size()>2){
            System.out.println(list.get(list.size()-3));
        }
        else if(list.size()<3){
        System.out.println(list.get(list.size())-1);
     }
    }
}
