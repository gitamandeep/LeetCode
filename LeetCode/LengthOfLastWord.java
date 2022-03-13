package LeetCode;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String s = "Hello World";

        int count  = 0;
        s = s.trim();
        char i = s.charAt(s.length()-1);
        while(i!= ' '){
           count++;
           if(s.length()-1-count<0){
               break;
           }
            i = s.charAt(s.length()-1-count);
        }
        System.out.println(count);
    }
}
