package credit.card.validation;

import java.util.*;
class CardValidation {
    long cardNum;
    List<Integer> validPrefixes = new ArrayList<>();

    CardValidation(long cardNum) {
        this.cardNum = cardNum;
        validPrefixes.add(4);
        validPrefixes.add(5);
        validPrefixes.add(6);
    }

    public void validate() {
        // Check if the card number is 16 digits
        if (!isSixteenDigits()) {
            System.out.println("This is not a valid credit card: Not a 16-digit number.");
            return;
        }

        // Check if the card starts with 4, 5, or 6
        if (!startsWithValidPrefix()) {
            System.out.println("This is not a valid credit card: Doesn't start with 4, 5, or 6.");
            return;
        }

        // Perform Luhn's test
        if (!luhnMethod(cardNum)) {
            System.out.println("This is not a valid credit card: Failed Luhn's test.");
            return;
        }

        System.out.println("This is a valid credit card.");
    }

    private boolean isSixteenDigits() {
        int counter = 0;
        long temp = cardNum;
        while (temp != 0) {
            temp /= 10;
            counter++;
        }
        return counter == 16;
    }

    private boolean startsWithValidPrefix() {
        long prefix = cardNum / 1000000000000000L; // Extract the first digit
        return validPrefixes.contains((int) prefix);
    }

    private boolean luhnMethod(long cardNum) {
        int sum = 0;
        boolean doubleDigit = false;

        while (cardNum > 0) {
            int digit = (int) (cardNum % 10);
            cardNum /= 10;

            if (doubleDigit) {
                digit *= 2;
                if (digit > 9) {
                    digit -= 9; // Subtract 9 to split and sum digits
                }
            }

            sum += digit;
            doubleDigit = !doubleDigit;
        }

        return sum % 10 == 0;
    }
}