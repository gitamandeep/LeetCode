package LeetCode;

public class NoOfStep {
    public static void main(String[] args) {

    }
    public int func(int n){
        return helper(n,0);
    }
    private int helper(int a, int count){
        if(a==0){
            return count;
        }
        if(a%2==0){
            return helper(a-2,count+1);
        }
        return helper(a-1,count+1);
    }
}
