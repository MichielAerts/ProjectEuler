package euler;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

/**
 * Created by Michiel on 21-8-2016.
 */
public class P26 {

    static int curLongest = 6;

    public static void main(String args[]) {

        long millis_start = System.currentTimeMillis();

        int max = 1000;
        int longestRecur = 7;
        int precision = 6000;

        for (int i = 1; i < max; i++) {
            BigDecimal one = BigDecimal.ONE;
            BigDecimal div = BigDecimal.valueOf(i);
            BigDecimal breuk = one.divide(div, precision, RoundingMode.HALF_UP);

            findLongestRecur(breuk, i);

        }
        long millis_stop = System.currentTimeMillis();
        System.out.println("Solution took " + (millis_stop - millis_start) + " milliseconds to complete");

    }

    static void findLongestRecur(BigDecimal breukD, int div) {

        String breuk = breukD.toString().substring(10);

        int max = 1000;
        int i = 6;

        while (i < max) {
            if (breuk.substring(0, i).equals(breuk.substring(i, 2 * i)) && breuk.substring(i, 2 * i).equals(breuk.substring(2 * i, 3 * i))) {
                if (breuk.substring(0, 6).equals(breuk.substring(6, 12))) {
                    i++;
                    break;
                }
                if (i > 6) {

                    if (i > curLongest) {
                        System.out.println("length: " + i + ", divisor: " + div);
                        curLongest = i;
                    }
                    i++;
                    break;
                }
            }
            i++;
        }
    }

}
