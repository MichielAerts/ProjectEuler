package euler;

/**
 * Created by Michiel on 10-9-2016.
 */
public class P31 {

    public static int[] numbers = {200, 100, 50, 20, 10, 5, 2, 1};

    public static void main(String args[]) {

        long millis_start = System.currentTimeMillis();

        // How many ways to make 200 using 1, 2, 5, 10, 20, 50, 100 & 200


        int aim = 200;
        int number = findWaysToMake(aim, 200);

//        int one = 1;
//        int two = 2;
//        int five = 5;
//        int ten = 10;
//        int twenty = 20;
//        int fifty = 50;
//        int hundred = 100;
//        int twohundred = 200;
//
//        int aim = 200;
//
//        int number = 1;
//        int cur = 0;
//
//        for (int ones = 0; ones <= aim/one; ones++) {
//            for (int twos = 0; twos <= aim/two; twos++) {
//                for (int fives = 0; fives <= aim/five; fives++) {
//                    for (int tens = 0; tens <= aim/ten; tens++) {
//                        for (int twenties = 0; twenties <= aim/twenty; twenties++) {
//                            for (int fifties = 0; fifties <= aim/fifty; fifties++) {
//                                for (int hundreds = 0; hundreds <= aim/hundred; hundreds++) {
//                                    cur = ones * 1 + twos * 2 + fives * 5 + tens * 10 + twenties * 20 + fifties * 50 + hundreds * 100;
//                                    if (cur == aim) {
//                                        number++;
//                                    }
//                                }
//                            }
//                        }
//                    }
//                }
//            }
//        }

        System.out.println(number);

        long millis_stop = System.currentTimeMillis();
        System.out.println("Solution took " + (millis_stop - millis_start) + " milliseconds to complete");

    }

    public static int findWaysToMake(int aim, int maxNumber) {

        int ways = 0;

        for (int number : numbers) {

            if (number > maxNumber) continue;

            if (aim - number == 0) {
                ways += 1;
            }
            if (aim - number > 0) {
                ways += findWaysToMake(aim - number, number);
            }
        }

        return ways;

    }
}
