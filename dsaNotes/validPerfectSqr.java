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
    //Now applying binary search
    static boolean perfectSqr(int num){
        int start = 1, end =num;
        while (start<=end){
            int mid = start + (end-start)/2 ;
            if(mid*mid == num){
                return true;
            }
            else if(mid*mid< num){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return false;

    }

}
