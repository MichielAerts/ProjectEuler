package euler;

/**
 * Created by Michiel on 8-7-2016.
 */
public class P12 {

    static int triangleCounter = 0;

    public static void main(String args[]) {

        long millis_start = System.currentTimeMillis();

        int max = 500;
        long oldTriangleNumber = 1L;
        long triangleNumber = 0L;

        while (no_divsors(triangleNumber) <= max) {

            oldTriangleNumber = triangleNumber;
            triangleNumber = nextTriangle(oldTriangleNumber);
            //System.out.println(triangleNumber + ", no of divisors: " + no_divsors(triangleNumber));
        }

        System.out.println(triangleNumber);
        long millis_stop = System.currentTimeMillis();
        System.out.println("Solution took " + (millis_stop - millis_start) + " milliseconds to complete");

    }

    static int no_divsors(long triangleNumber) {

        int no_divisors = 0;
        long limit = triangleNumber;

        for (int i = 1; i < limit; i++) {

            if (triangleNumber % i == 0) {
                limit = triangleNumber / i;
                if (limit != i) {
                    no_divisors += 1;
                }
                no_divisors += 1;
            }
        }

        return no_divisors;
    }

    static long nextTriangle(long curTriangle) {

        triangleCounter += 1;
        return curTriangle + triangleCounter;

    }

}


