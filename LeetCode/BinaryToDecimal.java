package LeetCode;

public class BinaryToDecimal {
    public static void main(String[] args) {
        int[] num = {0,1,0,0};
        int ans =0;
        int base = 1;

        for(int i = num.length-1;i>=0;i--){
            ans += num[i]*base;
            base = base*2;
        }
        System.out.println(ans);
    }

}
