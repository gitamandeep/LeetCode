package LeetCode;

public class AlternatingBits {
    public static void main(String[] args) {
        int n =5;
      while(n>1){
          int b = n>>1;
          if((n&1)== (b&1)){
              System.out.println(false);
          }
          n = n>>1;
      }

        }
    }

