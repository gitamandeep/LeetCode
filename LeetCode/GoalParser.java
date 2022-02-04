package LeetCode;

import java.util.Arrays;

public class GoalParser {
    public static void main(String[] args) {
        String command = "G()(al)";
        char[] ch = command.toCharArray();
        for(int i =0;i< ch.length;i++){
            if(ch[i]=='(' && ch[i+1]==')'){
                ch[i]='o';
                ch[i+1]=' ';
            }
            if(ch[i]=='(' && ch[i+1]=='a'){
                ch[i]=' ';
                ch[i+3]=' ';
            }
        }
        String ans = new String(ch);
        ans = ans.replaceAll("\\s","");
        System.out.println(ans);
        System.out.println(Arrays.toString(ch));

    }
}
