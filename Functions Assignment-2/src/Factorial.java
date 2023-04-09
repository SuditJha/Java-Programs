import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A number");
        int n=sc.nextInt();
        int factorial = factorial(n);
        System.out.println("Factorial = "+factorial);
    }

     static int factorial(int n) {
        if(n<=1)
            return 1;
        else
            return n* factorial(n-1);
    }
}
