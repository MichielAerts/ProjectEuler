package euler;

import java.util.HashMap;

/**
 * Created by Michiel on 16-7-2016.
 */
public class P17 {


    public static void main(String args[]) {

        long millis_start = System.currentTimeMillis();

        HashMap<Integer, String> map = new HashMap<>();

        String numbers1to99 = "\n" +
                "one\n" +
                "two\n" +
                "three\n" +
                "four\n" +
                "five\n" +
                "six\n" +
                "seven\n" +
                "eight\n" +
                "nine\n" +
                "ten\n" +
                "eleven\n" +
                "twelve\n" +
                "thirteen\n" +
                "fourteen\n" +
                "fifteen\n" +
                "sixteen\n" +
                "seventeen\n" +
                "eighteen\n" +
                "nineteen\n" +
                "twenty\n" +
                "twenty-one\n" +
                "twenty-two\n" +
                "twenty-three\n" +
                "twenty-four\n" +
                "twenty-five\n" +
                "twenty-six\n" +
                "twenty-seven\n" +
                "twenty-eight\n" +
                "twenty-nine\n" +
                "thirty\n" +
                "thirty-one\n" +
                "thirty-two\n" +
                "thirty-three\n" +
                "thirty-four\n" +
                "thirty-five\n" +
                "thirty-six\n" +
                "thirty-seven\n" +
                "thirty-eight\n" +
                "thirty-nine\n" +
                "forty\n" +
                "forty-one\n" +
                "forty-two\n" +
                "forty-three\n" +
                "forty-four\n" +
                "forty-five\n" +
                "forty-six\n" +
                "forty-seven\n" +
                "forty-eight\n" +
                "forty-nine\n" +
                "fifty\n" +
                "fifty-one\n" +
                "fifty-two\n" +
                "fifty-three\n" +
                "fifty-four\n" +
                "fifty-five\n" +
                "fifty-six\n" +
                "fifty-seven\n" +
                "fifty-eight\n" +
                "fifty-nine\n" +
                "sixty\n" +
                "sixty-one\n" +
                "sixty-two\n" +
                "sixty-three\n" +
                "sixty-four\n" +
                "sixty-five\n" +
                "sixty-six\n" +
                "sixty-seven\n" +
                "sixty-eight\n" +
                "sixty-nine\n" +
                "seventy\n" +
                "seventy-one\n" +
                "seventy-two\n" +
                "seventy-three\n" +
                "seventy-four\n" +
                "seventy-five\n" +
                "seventy-six\n" +
                "seventy-seven\n" +
                "seventy-eight\n" +
                "seventy-nine\n" +
                "eighty\n" +
                "eighty-one\n" +
                "eighty-two\n" +
                "eighty-three\n" +
                "eighty-four\n" +
                "eighty-five\n" +
                "eighty-six\n" +
                "eighty-seven\n" +
                "eighty-eight\n" +
                "eighty-nine\n" +
                "ninety\n" +
                "ninety-one\n" +
                "ninety-two\n" +
                "ninety-three\n" +
                "ninety-four\n" +
                "ninety-five\n" +
                "ninety-six\n" +
                "ninety-seven\n" +
                "ninety-eight\n" +
                "ninety-nine\n";

        String[] numbers1to99Array = numbers1to99.split("\n");

        String hundreds = "\n" +
                "one hundred\n" +
                "two hundred\n" +
                "three hundred\n" +
                "four hundred\n" +
                "five hundred\n" +
                "six hundred\n" +
                "seven hundred\n" +
                "eight hundred\n" +
                "nine hundred\n" +
                "one thousand\n";

        String[] hundreds0to1000Array = hundreds.split("\n");

        int countHundreds = 0;

        int totalLength = 0;

        for (int i = 1; i <= 1000; i++ ) {

            String number = "";
            if (i % 100 == 0 || (i / 100 == 0)) {
                number = number + hundreds0to1000Array[i / 100] + " " + numbers1to99Array[i % 100];
            } else {
                number = number + hundreds0to1000Array[i / 100] + " and " + numbers1to99Array[i % 100];
            }
            map.put(i, number);
            totalLength += lengthOfNumber(number);
            System.out.println("" + i + ": " + number + ", length: " + lengthOfNumber(number));
        }

        System.out.println("total Length: " + totalLength);

        long millis_stop = System.currentTimeMillis();
        System.out.println("Solution took " + (millis_stop - millis_start) + " milliseconds to complete");

    }

    static int lengthOfNumber(String number) {
        String numberShort = number.replace(" ","").replace("-","");
        return numberShort.length();
    }
}
