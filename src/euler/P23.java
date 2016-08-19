package euler;

import java.util.ArrayList;

/**
 * Created by Michiel on 31-7-2016.
 */
public class P23 {

    private static ArrayList<Integer> abundantNumbers = new ArrayList<>();

    public static void main(String args[]) {

        long millis_start = System.currentTimeMillis();

        int max = 28124;



        // Find the sum of all the positive integers which cannot be written as the sum of two abundant numbers. 28123

        for (int i = 1; i < max; i++) {
            if (isAbundant(i)) {
                abundantNumbers.add(i);
            }
        }

        int sum = 0;

        for (int i = 1; i < max; i++) {
            if (summableAbundant(i)) {
                continue;
            } else {
                sum += i;
                //System.out.println(i);
            }
        }

        System.out.println(sum);

        long millis_stop = System.currentTimeMillis();
        System.out.println("Solution took " + (millis_stop - millis_start) + " milliseconds to complete");

    }

    // check of number can be written as the sum of two numbers in abundantNumbers
    static boolean summableAbundant(int number) {

        int min = 0;
        int max = abundantNumbers.size() - 1;

        boolean isSummable = false;

        while (max >= min) {
            if ((abundantNumbers.get(max) + abundantNumbers.get(min)) == number) {
                isSummable = true;
                break;
            } else if (((abundantNumbers.get(max) + abundantNumbers.get(min)) > number)){
                max--;
            } else {
                min++;
            }
        }

        return isSummable;
    }

    static boolean isAbundant(int number) {

        if (sumDivisors(number) > number) {
            return true;
        } else {
            return false;
        }
    }

    static int sumDivisors(int number) {

        int sumDivisors = -number;
        int limit = number;

        for (int i = 1; i < limit; i++) {

            if (number % i == 0) {
                limit = number / i;
                if (limit != i) {
                    sumDivisors += i;
                }
                sumDivisors += limit;
            }
        }

        return sumDivisors;
    }
}
