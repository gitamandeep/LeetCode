package LeetCode;

import java.util.Arrays;

public class twoSum {
    public static void main(String[] args) {
//not valid is array contain same element

        int[] nums = {3,2, 4};
        int target = 6;
        System.out.println(Arrays.toString(fun(nums,6)));
            }
            static int[] fun(int[] nums, int target){
                int[] ans = new int[2];
                for(int i =0;i< nums.length-1;i++){
                    for (int j=i+1;j< nums.length;j++){
                        if(target==nums[i]+nums[j]){
                            ans[0] = i;
                            ans[1] = j;
                         return ans;
                        }
            }
        }
                return ans;
    }
}
