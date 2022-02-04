package LeetCode;

public class PowOf3 {
    public static void main(String[] args) {

    }
    static boolean func(int a){
        if(a%3!=0){
            return false;
        }
        if(a==3){
            return true;
        }
        return func(a/3);
    }
}
