package dsaNotes;

public class leetProblem {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        int[] ans = new int[2];
        ans[0] = binearySearch(nums,target,true);
        ans[1] = binearySearch(nums,target,false);

    }
    static int binearySearch(int[] nums,int target, boolean firstPosition){
         int start =0;
         int end = nums.length-1;
         int ans = -1;
         while (start<=end){
             int mid = end + (start-end)/2;
             if(nums[mid]<target){
                 start = mid +1;
             }
             else if(nums[mid]>target){
                 end = mid -1;
             }
             else{
                 //our potential answer
                 ans = mid;
                 if(firstPosition == true){
                     end = mid -1;
                 }
                 else {
                     start =mid +1;
                 }
             }
         }
         return ans;
    }
}
