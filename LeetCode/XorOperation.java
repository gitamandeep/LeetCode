package LeetCode;

public class XorOperation {
    public static void main(String[] args) {
        int start =0,n=5;
        int ans =0;
        int[] nums = new int[n];
        for(int i =0;i<n;i++){
            nums[i] = start + 2*i;
        }
        for(int i =0;i<n;i++){
            ans = ans^nums[i];
        }
        System.out.println(ans);
    }
}
