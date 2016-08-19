package euler;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;

/**
 * Created by Michiel on 21-7-2016.
 */
public class P19 {

    public static void main(String args[]) {

        long millis_start = System.currentTimeMillis();

        LocalDate date = LocalDate.of(1901,1,1);
        LocalDate end = LocalDate.of(2000,12,31);

        int noOfSundays = 0;

        while (date.isBefore(end)) {
            if (date.getDayOfWeek().getDisplayName(TextStyle.FULL,Locale.ENGLISH).equals("Sunday")) {
                noOfSundays++;
            }
            date = date.plusMonths(1);
        }

        System.out.println("no. of sundays: " + noOfSundays);

        long millis_stop = System.currentTimeMillis();
        System.out.println("Solution took " + (millis_stop - millis_start) + " milliseconds to complete");

    }
}
