public class RandomWalkers {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]) ;
        int trials = Integer.parseInt(args[1]) ;
        double total = 0.0 ;
        for (int i = 1 ; i <= trials ; i++)
        {
            double s ;
            int dx = 0, dy = 0, d = 0 ;
            int step = 0 ;
            while (d != r)
            {
                s = Math.random() ;
                if (s <= 0.25)
                    dy = dy + 1 ;
                else if (s <= 0.50)
                    dx = dx + 1 ;
                else if (s <= 0.75)
                    dy = dy - 1 ;
                else
                    dx =dx - 1 ;

                d = Math.abs(dx+dy) ;
                if (d>r)
                    break ;
                step++ ;
            }
            total = total + step ;
        }
        System.out.println("average number of steps = "+total/trials) ;
    }
}
