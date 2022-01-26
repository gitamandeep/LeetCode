package dsaNotes;

public class PrimeNum {
    public static void main(String[] args) {
        int n =40;
        boolean[] arr = new boolean[n+1];
        fun(arr,n);
        for(int i=2;i<=n;i++){
            if(!arr[i]){
                System.out.print(i + " ");
            }
        }
    }
    static void fun(boolean[] arr,int n){
        for(int i =2;i*i<n;i++){
            if(!arr[i]){
                for(int j =i*2;j<=n;j+=i){
                    arr[j] = true;
                }
            }
        }
    }
}
