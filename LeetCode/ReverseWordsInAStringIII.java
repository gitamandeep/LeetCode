package LeetCode;

public class ReverseWordsInAStringIII {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverse(s));
    }

    static String reverse(String str){
        if(str.isEmpty())
            return str;

        String[] words= str.split(" ");
        String ans="";
        for(String word : words)
        {
            StringBuilder sb= new StringBuilder(word);
            sb.reverse();
            ans += sb.toString() + " ";
        }
        return ans.trim();
        }
    }

