public class GeneralizedHarmonic {
    public static void main(String[] args) {
        int n , r ;
        n = Integer.parseInt(args[0]) ;
        r = Integer.parseInt(args[1]) ;
        double Hnr = 0.0 ;
        for ( int i = 1 ; i <= n ; i++ )
            Hnr = Hnr + 1.0/Math.pow(i,r) ;
        System.out.println(Hnr) ;

    }
}
