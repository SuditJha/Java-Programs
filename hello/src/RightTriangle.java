public class RightTriangle {
    public static void main(String[] args) {
        int a,b,c;
        a=Integer.parseInt(args[0]);
        b=Integer.parseInt(args[1]);
        c=Integer.parseInt(args[2]);
        boolean x=(a>0 &&b>0 && c>0);
        int m=Math.max(a,Math.max(b,c));
        x=x && ((m*m)==(a*a + b*b+c*c-m*m));
        System.out.println(x);
    }
}
