package LeetCode;

import java.util.Arrays;

public class ArraysortByfrequency {
    public static void main(String[] args) {
        int[] nums = {1,1,2,2,2,3};
        Arrays.sort(nums);
        int count = 1;
        for(int i =1; i<nums.length;i++){
            if(nums[i] != nums[i-1]){
                count++;
            }
        }
        System.out.println(count);
        // Doubt hoe to use maths mod function in java
    }
}
