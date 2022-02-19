package LeetCode;

public class UniquePaths {
    public static void main(String[] args) {
        int m =3;
        int n =3;
        System.out.println(count(m,n));
    }
    static int count(int row,int col){
        if(row==1 || col==1){
            return 1;
        }
        int left = count(row-1,col);
        int right = count(row,col-1);
        return left+right;
    }
}
