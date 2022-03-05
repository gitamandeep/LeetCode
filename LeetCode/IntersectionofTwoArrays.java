package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionofTwoArrays {
    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        List<Integer> list1 = new ArrayList<>();
        list1.add(nums1[0]);
        for(int i =1;i<nums1.length;i++){
            if(nums1[i]!=nums1[i-1]){
                list1.add(i);
            }
        }
        List<Integer> ansList = new ArrayList<>();
       for(int i =0;i< list1.size();i++){
           for(int j =0;j< nums2.length;j++){
               if(list1.get(i)==nums2[j]){
                   ansList.add(nums2[j]);
                   break;
               }
           }
       }


        System.out.println(ansList);
        }
    }

