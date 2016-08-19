package euler;

/**
 * Created by Michiel on 3-7-2016.
 */
public class P6 {

    public static void main(String args[]) {

        int max = 6;

        long sumSq = 0;
        long sum = 0;
        long sqSum = 0;

        for (int i = 1; i <= max; i++) {
            sumSq += i*i;
        }

        for (int i = 1; i <= max; i++) {
            sum += i;
        }

        sqSum = sum*sum;

        System.out.println(sqSum - sumSq);
    }
}
