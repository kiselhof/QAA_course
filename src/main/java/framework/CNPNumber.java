package framework;

import java.time.LocalDate;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import static java.lang.Character.getNumericValue;

public class CNPNumber {
    private static final String stringForMultiplying = "279146358279"; //for calculations
    private final String CNP;

    /**
     * Each person born in Romania receives a unique identification number.
     * The number has 13 digits.
     * CNP number (13 digits).
     */
    public CNPNumber() {
        LocalDate date = generateRandomDate();
        String twelveDigits = generate12Digits(date);
        String lastDigit = generateLastDigit(twelveDigits);
        this.CNP = twelveDigits + lastDigit;
    }


    public String getCNP() {
        return CNP;
    }

    /**
     * Randomly generate date in range (1900;2019).
     *
     * @return randomly generated LocalDate object.
     */
    private LocalDate generateRandomDate() {
        Random random = new Random();
        int minDay = (int) LocalDate.of(1900, 1, 1).toEpochDay(); //inclusive
        int maxDay = (int) LocalDate.of(2019, 1, 1).toEpochDay(); //exclusive
        long randomDay = minDay + random.nextInt(maxDay - minDay);

        return LocalDate.ofEpochDay(randomDay);
    }

    /**
     * Randomly generate 1 digit.
     *
     * @param min inclusive
     * @param max inclusive
     * @return 1 randomly generated digit
     */
    private String generateNumberInRange(int min, int max) {
        int randomInt = ThreadLocalRandom.current().nextInt(min, max + 1);
        return String.valueOf(randomInt);
    }

    /**
     * Randomly generate first digit that shows gender and century person was born at.
     *
     * @param myDate for specification of first digit
     * @return first digit
     */
    private String generateFirstDigit(LocalDate myDate) {
        String firstDigit;
        if (myDate.getYear() >= 1900 && myDate.getYear() <= 1999) {
            firstDigit = generateNumberInRange(1, 2);
        } else if (myDate.getYear() >= 1800 && myDate.getYear() <= 1899) {
            firstDigit = generateNumberInRange(3, 4);
        } else if (myDate.getYear() >= 2000 && myDate.getYear() <= 2099) {
            firstDigit = generateNumberInRange(5, 6);
        } else firstDigit = generateNumberInRange(7, 9);

        return firstDigit;
    }

    /**
     * Separate year of randomly generated date in String format "YY".
     *
     * @param myDate for separation
     * @return year of randomly generated date
     */
    private String generateYearDigit(LocalDate myDate) {
        String yearDigit = String.valueOf(myDate.getYear() % 100);
        int year = Integer.parseInt(yearDigit);
        if (year < 10) {
            return "0" + year;
        } else {
            return String.valueOf(year);
        }

    }

    /**
     * Separate month of randomly generated date in String format "MM".
     *
     * @param myDate for separation
     * @return month of randomly generated date
     */
    private String generateMonthDigit(LocalDate myDate) {
        int month = myDate.getMonthValue();
        if (month < 10) {
            return "0" + month;
        } else {
            return String.valueOf(month);
        }
    }

    /**
     * Separate day of randomly generated date in String format "DD".
     *
     * @param myDate for separation
     * @return day of randomly generated date
     */
    private String generateDayDigit(LocalDate myDate) {
        int day = myDate.getDayOfMonth();
        if (day < 10) {
            return "0" + day;
        } else {
            return String.valueOf(day);
        }

    }

    /**
     * Randomly generate 2 digits of CNP number
     *
     * @return randomly generated 2 digits of CNP number
     */
    private String generateCodeDigits() {
        String codeDigits = generateNumberInRange(0, 52);
        if (Integer.valueOf(codeDigits) > 9) {
            return codeDigits;
        } else {
            return "0" + codeDigits;
        }
    }

    /**
     * Randomly generate 3 last digits of CNP number
     *
     * @return randomly generated 3 last digits of CNP number
     */
    private String generateOrderDigits() {
        String orderDigits = generateNumberInRange(0, 9) + generateNumberInRange(0, 9) + generateNumberInRange(0, 9);
        return orderDigits;
    }

    /**
     * Generate twelve digits of CNP number.
     *
     * @param date for generating parts of CNP number
     * @return twelve digits of CNP number in String form
     */
    private String generate12Digits(LocalDate date) {
        String twelveDigits =
                generateFirstDigit(date)
                        + generateYearDigit(date)
                        + generateMonthDigit(date)
                        + generateDayDigit(date)
                        + generateCodeDigits()
                        + generateOrderDigits();
        return twelveDigits;
    }


    /**
     * Generate control sum of CNP number.
     * Take the first 12 numbers of the CNP and multiply
     * each number with the corresponding position
     * number from this string: 279146358279.
     * You divide that result by 11
     * if it is 10 then the last digit is 1
     * otherwise it equals the rest obtained
     *
     * @param twelveDigits before
     * @return the control sum
     */
    private String generateLastDigit(String twelveDigits) {
        int result = 0;
        for (int index = 0; index < stringForMultiplying.length(); index++) {
            result += getNumericValue(stringForMultiplying.charAt(index)) * getNumericValue(twelveDigits.charAt(index));
        }
        int checkDigit = result % 11;
        if (checkDigit == 10) {
            return "1";
        } else {
            return String.valueOf(checkDigit);
        }
    }


}
