package euler;

import java.util.HashMap;

/**
 * Created by Michiel on 25-7-2016.
 */
public class P21 {

    public static void main(String args[]) {

        long millis_start = System.currentTimeMillis();

        int maxNumber = 10000;
        long sumTotal = 0;
        HashMap<Integer, Integer> map = new HashMap<>(maxNumber);
        map.put(1,1);

        for (int i = 2; i < maxNumber; i++) {
            map.put(i,no_divisors(i));
        }

        for (int j = 1; j < maxNumber; j++) {
            if (map.get(j) <= maxNumber && map.get(map.get(j)) == j) {

                if (j != map.get(j)) {
                    System.out.println("amicable numbers: " + j + " & " + map.get(j));
                    sumTotal+=j;
                }
            }
        }
        System.out.println(sumTotal);

        long millis_stop = System.currentTimeMillis();
        System.out.println("Solution took " + (millis_stop - millis_start) + " milliseconds to complete");

    }

    static int no_divisors(int number) {

        int sumDivisors = -number;
        int limit = number;

        for (int i = 1; i < limit; i++) {

            if (number % i == 0) {
                limit = number / i;
                if (limit != i) {
                    sumDivisors += i;
                    }
                sumDivisors += limit;
//                System.out.println("limit: " + limit + ", i:" + i);
            }
        }

        return sumDivisors;
    }
}
