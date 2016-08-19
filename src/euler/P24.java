package euler;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Michiel on 7-8-2016.
 */
public class P24 {

    public static void main(String args[]) {

        long millis_start = System.currentTimeMillis();

        // Lexicographic permutations of 0123456789
        // 0,1,2


        String all = "0123456789";

        ArrayList<String> allResults = findPermutations(all);

        Collections.sort(allResults);


        System.out.println(allResults.get(1000000 - 1));

        long millis_stop = System.currentTimeMillis();
        System.out.println("Solution took " + (millis_stop - millis_start) + " milliseconds to complete");

    }

    static ArrayList<String> findPermutations(String chars) {

        ArrayList<String> res = new ArrayList<>();

        if (chars.length() == 1) {
            res.add(chars);
        } else {
            int last = chars.length() - 1;
            String lastNumber = chars.substring(last);
            String rest = chars.substring(0,last);

            res = merge(findPermutations(rest), lastNumber);
        }

        return res;
    }

    static ArrayList<String> merge(ArrayList<String> list, String lastNumber) {

        ArrayList<String> res = new ArrayList<>();

        for (String c : list) {

            for (int i = 0; i <= c.length(); i++ ) {
                String ps = new StringBuffer(c).insert(i, lastNumber).toString();
                res.add(ps);
            }
        }

        return res;
    }


}
