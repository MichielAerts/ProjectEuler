package euler;

import java.math.BigInteger;

/**
 * Created by Michiel on 5-7-2016.
 */
public class P10 {

    public static void main(String args[]) {

        long millis_start = System.currentTimeMillis();

        // sum of all primes below 2 million

        long max = 2000000;
        long sum = 2;

        for (long i = 3; i < max; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }
//
//        BigInteger sum = BigInteger.ZERO;
//
//        for (BigInteger num = BigInteger.valueOf(2); num.compareTo(BigInteger.valueOf(2000000)) < 0; num = num.nextProbablePrime())
//            sum = sum.add(num);

        System.out.println(sum);

        long millis_stop = System.currentTimeMillis();
        System.out.println("Solution took " + (millis_stop - millis_start) + " milliseconds to complete");

    }

    public static boolean isPrime(long c) {
        boolean isPrime = true;

        if (c < 1) {
            return false;
        }

        for (long i = 2; i <= Math.sqrt(c); i++ ) {
            if (c % i == 0) {
                isPrime = false;
                break;
            }
        }

        return isPrime;
    }
}
