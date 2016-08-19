package euler;

/**
 * Created by Michiel on 1-7-2016.
 */
public class P3 {

    public static void main(String args[]) {

        long number = 600851475143L;

        for (long i = 1; i < Math.sqrt(number); i++) {
            if (number % i == 0) {

                if (isPrime(i)) {
                    System.out.println(i);
                }

            }
        }
    }

    public static boolean isPrime(long c) {
        boolean isPrime = true;

        for (long i = 2; i <= Math.sqrt(c); i++ ) {
            if (c % i == 0) {
                isPrime = false;
            }

        }

        return isPrime;
    }
}
