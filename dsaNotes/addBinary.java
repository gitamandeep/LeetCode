package dsaNotes;
// NOT SOLVED YET
public class addBinary {
    public static void main(String[] args) {
        String a = "1110110101",b="1110111011";
        long sum = BinaryToDec(a) + BinaryToDec(b);
        long ansr = DecToBin(sum);
        String ans = String.valueOf(ansr);
        System.out.println(ans);

    }
    static long BinaryToDec(String n){
      long ans =0;
      for(int i =n.length()-1;i>=0;i--){
          if(n.charAt(i)=='1'){
              ans+=Math.pow(2,n.length()-1-i);
          }
      }
        return ans;
    }
    static long DecToBin(long n){
        long base =1,ans =0;
        while(n>0){
            ans+= (n%2)*base;
            n = n/2;
            base*=10;
        }
       return ans;
    }
}
