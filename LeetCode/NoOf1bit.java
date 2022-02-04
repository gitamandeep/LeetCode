package LeetCode;

public class NoOf1bit {
    public static void main(String[] args) {
        int n = 100011;
        String s = Integer.toString(n);
        int count = 0;
        for(int i =0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                count++;
            }
        }
        System.out.println(count);
    }
}
