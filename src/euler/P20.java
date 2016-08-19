package euler;

import java.math.BigInteger;

/**
 * Created by Michiel on 22-7-2016.
 */
public class P20 {


    public static void main(String args[]) {

        long millis_start = System.currentTimeMillis();

        int fact = 100;
        int sum = 0;
        BigInteger total = BigInteger.ONE;

        for (int i = 1; i <= fact; i++) {
            total = total.multiply(BigInteger.valueOf(i));
        }

        String totalString = total.toString();

        for (int j = 0; j < totalString.length(); j++) {
            sum += Character.getNumericValue(totalString.charAt(j));
        }

        System.out.println("sum of digits: " + sum);

        long millis_stop = System.currentTimeMillis();
        System.out.println("Solution took " + (millis_stop - millis_start) + " milliseconds to complete");

    }
}
