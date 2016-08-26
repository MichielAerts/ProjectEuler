package euler;

import static euler.P10.isPrime;

/**
 * Created by Michiel on 26-8-2016.
 */
public class P27 {
    public static void main(String args[]) {

        long millis_start = System.currentTimeMillis();

        int aMax = 1000;
        int bMax = 1000;
        int nMax = 0;

        for (int a = -aMax; a < aMax; a++) {
            for (int b = -bMax; b <= bMax; b++) {

                int n = 0;

                while (isPrime(n*n + a*n + b)) {
                    n++;
                }

                if ((n - 1) > nMax) {
                    System.out.println("new Record: " + (n - 1) + ", for a = " + a + " and b = " + b + ", product is " + a*b);
                    nMax = (n - 1);
                }
            }
        }

        long millis_stop = System.currentTimeMillis();
        System.out.println("Solution took " + (millis_stop - millis_start) + " milliseconds to complete");

    }
}
