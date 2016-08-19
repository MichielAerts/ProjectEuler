package euler;

/**
 * Created by Michiel on 3-7-2016.
 */
public class P7 {

    public static void main(String args[]) {

        int max = 10001;
        int cur_prime_number = 1;
        long number = 1;

        while (cur_prime_number < max) {
            number += 2;

            if (isPrime(number)) {
                cur_prime_number += 1;
            }

        }
        System.out.println(number);
    }

    public static boolean isPrime(long c) {
        boolean isPrime = true;

        for (long i = 2; i <= Math.sqrt(c); i++ ) {
            if (c % i == 0) {
                isPrime = false;
                break;
            }
        }

        return isPrime;
    }
}
