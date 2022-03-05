package LeetCode;

import java.util.ArrayList;

public class PerfectSquares {
    public static void main(String[] args) {
        int n = 7;
        System.out.println(numSquares(n));
        }


    static int numSquares(int n) {
        ArrayList<Integer> perfectSqrNumArr=perfectSquareNumGenerator(n); //Generates an array of perfect sqr num till n.
        if(perfectSqrNumArr.get(0)==n){ //If the number is a perfect sqr then return 1.
            return 1;
        }
        return numSquaresMain(n,perfectSqrNumArr,0,0); // Our main function
    }

    static int min=Integer.MAX_VALUE; //For storing the min number of addition required.

    static int numSquaresMain(int n, ArrayList<Integer> perfectSqrNumArr,int sum,int count) {
        if(sum>n || count>=min){
            return -1;
        }else if(sum==n){
            min=count;
            return count;
        }

        for(int i:perfectSqrNumArr){
            numSquaresMain(n,perfectSqrNumArr,sum+i,count+1);
        }

        return min;
    }

    static ArrayList<Integer> perfectSquareNumGenerator(int n){ //Function which generates an array of perfect sqr num till n.
        ArrayList<Integer> ans=new ArrayList<>();

        int limit = (int)Math.sqrt(n);

        for(int i=limit;i>0;i--){
            ans.add(i*i);
        }

        return ans;
    }

}