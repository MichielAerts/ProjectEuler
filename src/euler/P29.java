package euler;

import java.math.BigInteger;
import java.util.HashSet;

/**
 * Created by Michiel on 3-9-2016.
 */
public class P29 {

    public static void main(String args[]) {

        long millis_start = System.currentTimeMillis();

        HashSet<BigInteger> set = new HashSet<>();

        int a_max = 100;
        int b_max = 100;

        for (int a = 2; a <= a_max; a++) {
            for (int b = 2; b <= b_max; b++) {
                BigInteger number = BigInteger.valueOf(a).pow(b);
                set.add(number);
            }
        }

        //System.out.println(set);
        System.out.println("size: " + set.size());

        long millis_stop = System.currentTimeMillis();
        System.out.println("Solution took " + (millis_stop - millis_start) + " milliseconds to complete");

    }
}
