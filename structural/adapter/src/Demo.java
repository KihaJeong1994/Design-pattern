import java.io.InputStreamReader;
import java.util.Arrays;

import adapters.SquarePegAdapter;
import round.RoundHole;
import round.RoundPeg;
import square.SquarePeg;

public class Demo {
    public static void main(String[] args) throws Exception {
        RoundHole hole = new RoundHole(5);
        RoundPeg roundPeg = new RoundPeg(3);
        SquarePeg squarePeg = new SquarePeg(4);
        SquarePeg bigSquarePeg = new SquarePeg(20);
        System.out.println(hole.fits(roundPeg));
        System.out.println(hole.fits(new SquarePegAdapter(squarePeg)));
        System.out.println(hole.fits(new SquarePegAdapter(bigSquarePeg)));
    }
    
}
