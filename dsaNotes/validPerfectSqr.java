package dsaNotes;

public class validPerfectSqr {
    public static void main(String[] args) {
        int num = 81;
        System.out.println(perfectSqr(num));
    }
    /*Time limit exeed :(
    static boolean perfectSqr(int num){

        for(int i =1;i<=num;i++){
            if(i*i == num){
                return true;
            }
            else if(i*i > num){
                return false;
            }
        }
        return false;
    }*/

}
