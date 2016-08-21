package euler;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

/**
 * Created by Michiel on 21-8-2016.
 */
public class P26 {

    public static void main(String args[]) {

        long millis_start = System.currentTimeMillis();

        int max = 100;
        int longestRecur = 7;
        int curRecur = 0;
        int precision = 100;

        for (int i = 10; i < max; i++) {
            BigDecimal one = BigDecimal.ONE;
            BigDecimal div = BigDecimal.valueOf(i);
            BigDecimal breuk = one.divide(div, precision, RoundingMode.HALF_UP);

            curRecur = findLongestRecur(breuk, longestRecur);

            if (curRecur > longestRecur) {
                longestRecur = curRecur;
                System.out.println("langste herhaling: " + longestRecur + "breuk: 1/" + i);
            }
        }
        long millis_stop = System.currentTimeMillis();
        System.out.println("Solution took " + (millis_stop - millis_start) + " milliseconds to complete");

    }

    static int findLongestRecur(BigDecimal breukD, int curLongest) {


        //https://www.quora.com/Write-a-program-to-return-the-longest-repeating-substring-in-a-string
        String breuk = breukD.toString().substring(10);
        System.out.println(breuk);
        return 0;
    }

}
