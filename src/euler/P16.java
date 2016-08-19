package euler;

import java.math.BigInteger;

/**
 * Created by Michiel on 15-7-2016.
 */
public class P16 {

    public static void main(String args[]) {

        long millis_start = System.currentTimeMillis();

        BigInteger result = BigInteger.ONE;

        int power = 1000;
        for (int i = 1; i <= power; i++) {
            result = result.multiply(BigInteger.valueOf(2));
        }

        System.out.println(result);
        String resultString = result.toString();
        BigInteger sum = BigInteger.ZERO;

        for (int j = 0; j < resultString.length(); j++) {
            sum = sum.add(BigInteger.valueOf(new Long(Character.getNumericValue(resultString.charAt(j)))));
        }

        System.out.println(sum);
        long millis_stop = System.currentTimeMillis();
        System.out.println("Solution took " + (millis_stop - millis_start) + " milliseconds to complete");

    }

}
