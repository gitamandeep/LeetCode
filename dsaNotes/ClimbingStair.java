package dsaNotes;

public class ClimbingStair {
    public static void main(String[] args) {
        int n =5;
            if(n==1){
                System.out.println(1);
            }
            else {
                System.out.println(fun(n));
            }
    }
    static int fun(int n){
        if(n==2){
            return 2;
        }
        int ans = fun(n-1)+n-2;
        return ans;
    }
}
