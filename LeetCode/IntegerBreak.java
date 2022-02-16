package LeetCode;

public class IntegerBreak {
    public static void main(String[] args) {
        int n = 3;
        int ans;
        if(n ==2){
            ans = 1;
        }
        else if(n==3){
            ans = 2;
        }
        else if(n%3==0){
            ans = (int)Math.pow(3,n/3);
        }
        else if(n%3 ==1){
            ans = (int)Math.pow(3,(n/3)-1)*4;
        }
        else {
            ans = (int)Math.pow(3,(n/3))*2;
        }
        System.out.println(ans);
    }
}
