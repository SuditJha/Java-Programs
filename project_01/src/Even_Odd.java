/**Write a program to print whether a number is even or odd, also take
 input from the user.*/

import java.util.Scanner;
public class Even_Odd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter A Number : ");
        int n=sc.nextInt();
        if(n%2==0)
            System.out.println("Even Number");
        else
            System.out.println("Odd Number");
    }
}
