package dsaNotes;

public class SingleNumber {
    public static void main(String[] args) {
        int ans =0;
        int[] nums = {2,2,4,6,6};
        for(int i=0;i<nums.length;i++){
            ans ^=nums[i];
        }
    }
}
