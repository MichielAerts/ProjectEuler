package euler;

/**
 * Created by Michiel on 3-7-2016.
 */
public class P5 {
    public static void main(String args[]) {
        long number = 20;
        while (!isDivisible(number)) {
            number += 20;
        }

        System.out.println(number);
    }
    public static boolean isDivisible(long number) {
        boolean isDivisible = true;

        for (int i = 3; i < 20; i++) {
            if (number % i != 0) {
                isDivisible = false;
                break;
            }
        }
        return isDivisible;
    }
}
