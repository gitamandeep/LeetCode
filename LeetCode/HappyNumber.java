package LeetCode;


//Incomplete
public class HappyNumber {
    public static void main(String[] args) {
     int n = 2;
       while (digitSum(n) >9){
            n = digitSum(n);
        }
       n = digitSum(n);
       if(n==1){
           System.out.println(true);
       }
       else{
           System.out.println(false);
       }
    }
    static int digitSum(int a){
        int ans =0;
        while (a>0){
            ans+= (a%10)*(a%10);
            a/=10;
        }
        return ans;
    }
}
