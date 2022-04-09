package pl.sdacademy.java.basic.day3;

import java.util.regex.Pattern;

public class Task2 {
    private static final String PL_IBAN_REGEX = "PL[0-9]{26}"; // [A-Z]{2} -> dwa znaki z przedziału od A-Z

    public static void main(String[] args) {
        String correctIban = "PL10105000997603123456789123";
        System.out.println("If PL IBAN " + correctIban + " has correct format: " + isCorrectIbanFormat(correctIban));

        String inCorrectIban = "PL123456789";
        System.out.println("If PL IBAN " + inCorrectIban + " has correct format: " + isCorrectIbanFormat(inCorrectIban));
    }

    private static boolean isCorrectIbanFormat(String iban) {
        Pattern pattern = Pattern.compile(PL_IBAN_REGEX);
        return pattern.matcher(iban).matches();
    }
}
