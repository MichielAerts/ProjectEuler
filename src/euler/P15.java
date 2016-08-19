package euler;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Michiel on 12-7-2016.
 */
public class P15 {

    static HashMap<ArrayList<Integer>,Long> cache = new HashMap<>();

    public static void main(String args[]) {

        long millis_start = System.currentTimeMillis();

        System.out.println(findRoutes(20,20));

//        ArrayList<String> tracks = new ArrayList<>();
//
//        for (int i = 0; i < tries; i++) {
//
//            if (i % 100000 == 0) {
//                System.out.println(i);
//            }
//
//            String track = "";
//
//            while (countR(track) < gridsize || countD(track) < gridsize) {
//                if (Math.random() < 0.5) {
//                    if (countR(track) < gridsize ) {
//                        track = track + "r";
//                    } else {
//                        continue;
//                    }
//
//                } else {
//                    if (countD(track) < gridsize) {
//                        track = track + "d";
//                    } else {
//                        continue;
//                    }
//                }
//            }
//
//            if (tracks.contains(track)) {
//                continue;
//            } else {
//                tracks.add(track);
//            }
//        }
//
//        for (String track : tracks) {
//            System.out.println(track);
//        }
//
//        System.out.println("total: " + tracks.size());

        long millis_stop = System.currentTimeMillis();
        System.out.println("Solution took " + (millis_stop - millis_start) + " milliseconds to complete");

    }

    static long findRoutes(int x, int y) {

        ArrayList<Integer> c = new ArrayList<>(2);
        c.add(x);
        c.add(y);

        if (cache.containsKey(c)) {
            return cache.get(c);
        }

        long routes = 0;

        if (x > 0) {
            routes += findRoutes(x - 1, y);
        }
        if (y > 0) {
            routes += findRoutes(x, y - 1);
        }

        if (x == 0 && y == 0){
            routes +=1;
        }
        cache.put(c, routes);

        return routes;
    }
//
//    public static int countR(String track) {
//
//        int count = 0;
//
//        for (int i = 0; i < track.length(); i++) {
//            if (track.charAt(i) == 'r') {
//                count++;
//            }
//        }
//
//        return count;
//    }
//
//    public static int countD(String track) {
//
//        int count = 0;
//
//        for (int i = 0; i < track.length(); i++) {
//            if (track.charAt(i) == 'd') {
//                count++;
//            }
//        }
//
//        return count;
//    }
}