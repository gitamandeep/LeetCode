package LeetCode;

public class SubtracttheProductandSum {
    public static void main(String[] args) {
        // 1 <= n <= 10^5
        int n = 234;
         int ans = ProductOfDigit(n) - SumOfDigit(n);

        System.out.println(ans);
    }
    static int SumOfDigit(int a){
        if(a ==0){
            return 0;
        }
        return a%10 + SumOfDigit(a/10);
    }
    static int ProductOfDigit(int b){
        if(b == 0){
            return 1;
        }
        return b%10 * ProductOfDigit(b/10);
    }
}
