/**
 * Write a program Kary that takes two integer command line arguments i and k and converts
 * i to base k.
 * Assume that i is an integer in Java’s long data type and that k is an integer
 * between 2 and 16.
 * For bases greater than 10,use the letters A through F to represent the
 * 11th through 16th digits, respectively
 */
public class Power {
    public static void main(String[] args) {
        int i=Integer.parseInt(args[0]);
        int k=Integer.parseInt(args[1]);
        String str="";
        while(i>0)
        {
            int rem=i%k;
            if(rem<10)
                str=rem+str;
            else
                str=(char)(65+(rem-10)) + str;
            i=i/k;

        }
        System.out.println(str);
    }
}
