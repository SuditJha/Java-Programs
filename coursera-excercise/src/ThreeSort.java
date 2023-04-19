public class ThreeSort {
    public static void main(String[] args) {

        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        int c=Integer.parseInt(args[2]);
        int m=Math.max(a,Math.max(b,c));
        int n=Math.min(a,Math.min(b,c));
        int x=a+b+c-m-n;
        System.out.println(n);
        System.out.println(x);
        System.out.println(m);

    }
}
