package euler;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Michiel on 1-7-2016.
 */
public class P2 {
    public static void main(String args[]) {
//        ArrayList<Integer> fib = new ArrayList<>();
//
//        fib.add(1);
//        fib.add(2);
//
//        int newElement = 0;
//        int max = 4000000;
//        int sum = 2;
//        while (true) {
//            newElement = (fib.get(fib.size() - 2) + fib.get(fib.size() - 1));
//            if (newElement < max) {
//                //System.out.println(newElement);
//                fib.add(newElement);
//                if (newElement % 2 == 0) {
//                    sum = sum + newElement;
//                    //System.out.println(newElement);
//                }
//            }
//            else {
//                break;
//            }
//        }

        int x = 1;
        int y = 2;
        int z = x + y;
        int max = 4000000;
        int sum = 2;

        while (z < max) {

            if (z % 2 == 0) {
                sum = sum + z;
            }
            x = y;
            y = z;
            z = x + y;
        }

        System.out.print(sum);
    }

}
