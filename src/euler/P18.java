package euler;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Michiel on 17-7-2016.
 */
public class P18 {

    static private int[][] triangle;

    static HashMap<ArrayList<Integer>, Integer> cache = new HashMap<>();

    public static void main(String args[]) {

        long millis_start = System.currentTimeMillis();

//        String triangleString = "" +
//                "3\n" +
//                "7 4\n" +
//                "2 4 6\n" +
//                "8 5 9 3";

        String triangleString = "" +
                "75\n" +
                "95 64\n" +
                "17 47 82\n" +
                "18 35 87 10\n" +
                "20 04 82 47 65\n" +
                "19 01 23 75 03 34\n" +
                "88 02 77 73 07 63 67\n" +
                "99 65 04 28 06 16 70 92\n" +
                "41 41 26 56 83 40 80 70 33\n" +
                "41 48 72 33 47 32 37 16 94 29\n" +
                "53 71 44 65 25 43 91 52 97 51 14\n" +
                "70 11 33 28 77 73 17 78 39 68 17 57\n" +
                "91 71 52 38 17 14 91 43 58 50 27 29 48\n" +
                "63 66 04 68 89 53 67 30 73 16 69 87 40 31\n" +
                "04 62 98 27 23 09 70 98 73 93 38 53 60 04 23";

        String[] triangleStringArray = triangleString.split("\n");

        int depthTriangle = triangleStringArray.length;

        triangle = new int[depthTriangle][];

        for (int i = 0; i < depthTriangle; i++) {
            String[] rowString = triangleStringArray[i].split(" ");
            int[] row = new int[rowString.length];

            for (int j = 0; j < rowString.length; j++) {
                row[j] = Integer.parseInt(rowString[j]);
            }
            triangle[i] = row;
        }

        int max = 0;
        for (int i = 0; i < depthTriangle; i++) {
            if (findMaxRoute(depthTriangle - 1, i) > max) {
                max = findMaxRoute(depthTriangle - 1, i);
            }
        }

        System.out.println(max);
        long millis_stop = System.currentTimeMillis();
        System.out.println("Solution took " + (millis_stop - millis_start) + " milliseconds to complete");

    }

    static int findMaxRoute(int triangleRow, int triangleCol) {

        ArrayList<Integer> c = new ArrayList<>(2);
        c.add(triangleRow);
        c.add(triangleCol);

        if (cache.containsKey(c)) {
            return cache.get(c);
        }

        int maxRoute = 0;

        if (triangleRow == 0) {
            return triangle[0][0];
        } else {
            if (triangleCol == 0){
                maxRoute = triangle[triangleRow][triangleCol] + findMaxRoute(triangleRow - 1, triangleCol);
                cache.put(c,maxRoute);
                return maxRoute;
            } else if (triangleCol == triangleRow) {
                maxRoute = triangle[triangleRow][triangleCol] + findMaxRoute(triangleRow - 1, triangleCol - 1);
                cache.put(c,maxRoute);
                return maxRoute;
            } else {
                if (findMaxRoute(triangleRow - 1, triangleCol - 1) > findMaxRoute(triangleRow - 1, triangleCol)) {
                    maxRoute = triangle[triangleRow][triangleCol] + findMaxRoute(triangleRow - 1, triangleCol - 1);
                    cache.put(c,maxRoute);
                    return maxRoute;
                } else {
                    maxRoute = triangle[triangleRow][triangleCol] + findMaxRoute(triangleRow - 1, triangleCol);
                    cache.put(c,maxRoute);
                    return maxRoute;
                }
            }
        }
    }
}
