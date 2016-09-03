package euler;

/**
 * Created by Michiel on 3-9-2016.
 */
public class P30 {

    public static void main(String args[]) {

        long millis_start = System.currentTimeMillis();

        int power = 5;

        int max = 10000000;
        int sum = 0;

        for (int i = 10; i < max; i++) {
            if (sumOfPowers(i, power)) {
                sum += i;
                System.out.println(i);
            }
        }

        System.out.println("total sum is: " + sum);

        long millis_stop = System.currentTimeMillis();
        System.out.println("Solution took " + (millis_stop - millis_start) + " milliseconds to complete");

    }

    public static boolean sumOfPowers(int number, int power) {

        String numString = Integer.toString(number);
        int sum = 0;

        for (int i = 0; i < numString.length(); i++) {
            sum += Math.pow(Double.parseDouble(numString.substring(i,i + 1)), power);
        }

        if (sum == number) {
            return true;
        } else {
            return false;
        }
    }
}
