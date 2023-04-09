import java.util.Scanner;
public class Pythogorean_triplet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter 3 Numbers");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if(triplet(a,b,c))
            System.out.println("Pythagorean Triplet");
        else
            System.out.println("Not Pythagorean Triplet");
    }

    static boolean triplet(int a, int b, int c)
    {
        int max=Math.max(a,Math.max(b,c));
        int min1,min2;

        if(a==max)
        {
            min1=b;
            min2=c;

        }
        else if (b==max) {
            min1=a;
            min2=c;

        }
        else {
            min1=a;
            min2=b;

        }
        max*=max;
        min1*=min1;
        min2*=min2;
        if(max==(min1+min2))
            return true;
        return false;
    }
}
