package Theory;
import java.util.Scanner;
public class amastrong {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        int c =a;
        int sum =0;
        while (a>0) {
            int b = a%10;
            b = b*b*b;
            sum = sum+b;
            a = a/10;
        }
        if(sum==c){
            System.out.println("it is amastrong");
        }
        else{
            System.out.println("it is not a amastrong");
        }
    }
}
