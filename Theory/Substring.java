package Theory;

public class Substring {
    //1.skip letter a
    //2.skip string apple
    public static void main(String[] args) {
        String str = "amanappledeep";
        System.out.println(skipapple(str));
    }
    static String skip(String str){
        if(str.length() ==0){
            return str;
        }
        char ch = str.charAt(0);
       if(str.charAt(0)=='a'){
            return skip(str.substring(1));
        }
        return ch+ skip(str.substring(1));
    }
    static String skipapple(String str){
        if(str.length()==0){
            return str;
        }
        char ch = str.charAt(0);
        if(str.startsWith("apple")){
            return str.substring(5);
        }
        return ch + skipapple(str.substring(1));
    }
}
