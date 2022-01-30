package dsaNotes;

public class Recursion {
    public static void main(String[] args) {
        int n =5;
        func(n);
        }
    static void func(int a){
        if(a==0){
           return;
        }

        func(a-1);
        System.out.print(a+ " " );

    }
    }


