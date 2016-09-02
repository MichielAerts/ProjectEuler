package euler;

/**
 * Created by Michiel on 2-9-2016.
 */
public class P28 {

    public static void main(String args[]) {

        long millis_start = System.currentTimeMillis();

        int spiral_size = 1001;

        int number = 1;
        int spiral = 3;
        int total = 1;

        while (spiral <= spiral_size) {

            for (int i = 1; i <= 4; i++) {
                number += (spiral - 1);
                total += number;
            }
            spiral += 2;
        }

        System.out.println(total);

        long millis_stop = System.currentTimeMillis();
        System.out.println("Solution took " + (millis_stop - millis_start) + " milliseconds to complete");

    }

}
