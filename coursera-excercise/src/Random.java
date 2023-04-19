/**
 * Uniform random numbers. Write a program that prints five uniform random numbers between 0 and 1,
 * their average value, and their minimum and maximum values. Use Math.random(), Math.min(),
 * and Math.max().
 */

public class Random {
    public static void main(String[] args) {
        double a,b,c,d,e,average,max,min;
        a=Math.random();
        b=Math.random();
        c=Math.random();
        d=Math.random();
        e=Math.random();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        average=a+b+c+d+e;
        average/=5;
        System.out.println("Average = "+average);
        System.out.println(Math.max(a,Math.max(b,Math.max(c,Math.max(d,e)))));
        System.out.println(Math.min(a,Math.min(b,Math.min(c,Math.min(d,e)))));
    }
}
