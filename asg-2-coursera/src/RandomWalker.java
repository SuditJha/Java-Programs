public class RandomWalker {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]), dx = 0, dy = 0, d = 0 ;
        double s ;
        long step = 0 ;
        System.out.println("("+dx+", "+dy+")");
        while (d != r)
        {
            s = Math.random() ;
            if(s <= 0.25)
                dy = dy + 1 ;
            else if(s <= 0.50)
                dx = dx + 1 ;
            else if(s <= 0.75)
                dy = dy - 1 ;
            else
                dx =dx - 1 ;

            d = Math.abs(dx+dy) ;
            if(d>r)
                break ;
            System.out.println("("+dx+", "+dy+")") ;
            step++ ;
        }
        System.out.println("steps = "+step) ;
    }
}