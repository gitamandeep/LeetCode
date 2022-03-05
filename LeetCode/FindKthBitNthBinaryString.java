package LeetCode;

public class FindKthBitNthBinaryString {
    public static void main(String[] args) {

        int n = 4;
        String ans = fun(11,"0");
        System.out.println(ans.charAt(n-1));
    }
    static String fun(int n,String s1){
        if(n==1){
            return s1;
        }
        return fun(n-1,s1+"1"+reverse(invert(s1)));
    }



    static String reverse(String a){
        StringBuilder b = new StringBuilder();
        b.append(a);
        b.reverse();
        return b.toString();
    }
    static String invert(String a){
    StringBuilder b = new StringBuilder();
    b.append(a);
        for(int i =0;i<a.length();i++){
            if(b.charAt(i) == '0'){
                b.setCharAt(i,'1');
            }
            else{
                b.setCharAt(i,'0');
            }
        }
        return b.toString();
    }


}
