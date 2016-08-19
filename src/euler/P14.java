package euler;

/**
 * Created by Michiel on 11-7-2016.
 */
public class P14 {


    public static void main(String args[]) {

        long millis_start = System.currentTimeMillis();

        long longestCollatz = 0;

        for (long i = 1; i < 1000000; i++) {
            if (collatz(i) > longestCollatz) {
                longestCollatz = collatz(i);
                System.out.println(i);
            }
        }
        System.out.println(longestCollatz);

        long millis_stop = System.currentTimeMillis();
        System.out.println("Solution took " + (millis_stop - millis_start) + " milliseconds to complete");

    }

    public static int collatz(long number) {
        int count = 1;
        while (number != 1) {

//            if (number > Integer.MAX_VALUE / 3) {
//                System.out.print("Danger!");
//            }

            if (number % 2 == 0) {
                number = number / 2;
                count += 1;
            } else {
                number = 3 * number + 1;
                count += 1;
            }
        }
        return count;
    }
}
