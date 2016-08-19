package euler;

/**
 * Created by Michiel on 5-7-2016.
 */
public class P9 {

    public static void main(String args[]) {

        long millis_start = System.currentTimeMillis();

        // a + b + c = 1000;
        // a^2 + b^2 = c^2;
        // c = sqrt(a^2 + b^2)
        // a < b < c;
        // all natural numbers
        // a + b + sqrt(a^2 + b^2) = 1000;

        double eps = 0.00001;
        for (double a = 1; a < 333; a++) {
            for (double b = a; b < 500; b++) {
                if (Math.abs(a + b + Math.sqrt(a*a + b*b) - 1000) < eps) {
                    System.out.println("a = " + a + ", b = " + b + ", c = " + Math.sqrt(a*a + b*b));
                    System.out.println("Product abc = " + a*b*Math.sqrt(a*a + b*b));
                }
            }
        }

        long millis_stop = System.currentTimeMillis();
        System.out.println("Solution took " + (millis_stop - millis_start) + " milliseconds to complete");

    }
}
