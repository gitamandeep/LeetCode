package LeetCode;

public class PrimeInSetbit {
    public static void main(String[] args) {
        int left =10,right =15;
        int ans =0;
        for(int i =left;i<=right;i++){
            if(prime(setBit(i))==true){
                ans++;
            }
        }
        System.out.println(ans);
    }
    static int setBit(int n){
        int count =0;
        while(n>0){
            if((n&1)==1){
                count++;
            }
            n>>=1;
        }
        return count;
    }

    static boolean prime(int n){
        if(n==1){
            return false;
        }
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}

