package euler;

/**
 * Created by Michiel on 1-7-2016.
 */
public class P1 {

    public static void main(String args[]) {

        int sum = 0;
        float max = 1000;

        for (int i = 1; i < (max/5); i++) {
            sum = sum + 5 * i;
            System.out.println(5 * i);
        }

        for (int j = 1; j < (max/3); j++) {
            if (j % 5 != 0) {
                sum = sum + 3 * j;
                System.out.println(3 * j);
            }

        }
        System.out.println(sum);
    };
};
