package LeetCode;

public class HouseRobber {
    public int rob(int[] nums) {
        int a = 0; // house robbed
        int b = 0; // house not robbed
        for (int i = 0; i < nums.length; i++) {
            int curr = b + nums[i]; // not robbed earlier, so rob curr one i.e. i th one, as let i-1 is not robbed
            b = Math.max(a, b); // max of robed and not robbed house
            a = curr; // robbed curr house
        }
        return Math.max(a, b); // max of robbed and not robbed
    }
}