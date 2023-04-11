import java.util.Scanner;
public class Sum_of_first_n_natural_numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A Number");
        int n=sc.nextInt();
        System.out.println("Sum = "+sum(n));

    }
    static int sum(int n)
    {
        return (n*(n+1)/2);
    }
}
