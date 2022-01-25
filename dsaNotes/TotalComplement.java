package dsaNotes;

public class TotalComplement {
    public static void main(String[] args) {
      int num =2147483647;
        int maxDigit = (int)(Math.log(num)/Math.log(2)) +1;

        int max = (int)Math.pow(2,maxDigit) -1;

        System.out.println(Integer.toBinaryString(num));
        System.out.println(num^max);
    }

}
