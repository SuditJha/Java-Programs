import java.util.Scanner;
public class Prime_numbers_list {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.println("Enter the range of numbers : ");
        int a=in.nextInt();
        int b=in.nextInt();
        for(int i=a;i<=b;i++)
        {
            if(isprime(i))
                System.out.print(" "+i);
        }
    }

    static boolean isprime (int n)
    {
        int f=0,i;
        for(i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                f=1;break;
            }
        }
        if(f==0)
            return true;
        return false;
    }
}
