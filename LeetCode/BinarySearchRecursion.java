package LeetCode;

public class BinarySearchRecursion {
    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;
        System.out.println(func(nums,target,0, nums.length-1));
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
