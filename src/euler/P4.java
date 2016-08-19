package euler;

/**
 * Created by Michiel on 1-7-2016.
 */
public class P4 {

    public static void main(String args[]) {

        int highestFound = 0;
        int testnumber;

        for (int no1 = 999; no1 > 0; no1--) {
            for (int no2 = 999; no2 > 0; no2--) {
                testnumber = no1 * no2;
                if (isPalindrome(testnumber)) {
                    if (testnumber > highestFound) {
                        highestFound = testnumber;
                    }
                }
            }
        }
        System.out.println(highestFound);
    }

    public static boolean isPalindrome(int number) {

        String numberString = Integer.toString(number);
        boolean isPalindrome = false;

        if (numberString.length() == 6) {
            if (numberString.charAt(5) == numberString.charAt(0) && numberString.charAt(4) == numberString.charAt(1) && numberString.charAt(3) == numberString.charAt(2)) {
                isPalindrome = true;
            }

        }

        if (numberString.length() == 5) {
            if (numberString.charAt(4) == numberString.charAt(0) && numberString.charAt(3) == numberString.charAt(1)) {
                isPalindrome = true;
            }

        }

        if (numberString.length() == 4) {
            if (numberString.charAt(3) == numberString.charAt(0) && numberString.charAt(2) == numberString.charAt(1)) {
                isPalindrome = true;
            }

        }

        return isPalindrome;
    }
}
