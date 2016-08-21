package euler;

import java.math.BigInteger;

/**
 * Created by Michiel on 21-8-2016.
 */
public class P25 {

    public static void main(String args[]) {

        long millis_start = System.currentTimeMillis();

        BigInteger fibmin1 = BigInteger.valueOf(1);
        BigInteger fibmin2 = BigInteger.valueOf(1);
        BigInteger fibnew = fibmin1.add(fibmin2);

        int maxLength = 1000;
        long term = 3;

        while (lengthOfFib(fibnew) < maxLength) {
            fibmin1 = fibmin2;
            fibmin2 = fibnew;
            fibnew = fibmin1.add(fibmin2);
            term +=1;
        }

        System.out.println("Fibonacci term: " + term + ", Fibonacci number:" + fibnew);

        long millis_stop = System.currentTimeMillis();
        System.out.println("Solution took " + (millis_stop - millis_start) + " milliseconds to complete");

    }

    static public int lengthOfFib(BigInteger fib) {
        return fib.toString().length();
    }
}
