package LeetCode;

public class sqrt {
    public static void main(String[] args) {
//WRONG SOLUTION

        int x = 17;
        int ans = 1;
        while ((ans * ans) < x) {
            ans++;
        }
        ans--;
      //  return ans;
        System.out.println(ans);

    }
}