package dsaNotes;

public class BinToDec {
    public static void main(String[] args) {
        String a ="11";
        String b = "1";
        int decA = binaryToDecimal(a);
        int decB = binaryToDecimal(b);
        int sum = decA+decB;
        System.out.println(sum);

    }


   static int binaryToDecimal(String a){
        int ans =0;
        int base =1;
        for(int i = a.length()-1;i>=0;i--){
            ans+= a.charAt(i)*base;
            base = base*2;
        }
        return ans;
    }
    }

