package pl.sdacademy.java.basic.day1;

import java.util.Scanner;

public class Task7 {
    private static final String STOP_DECISION = "Stop";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String decision;
        do {
            System.out.print("Please insert firstDigit: ");
            float firstDigit = scanner.nextFloat();
            scanner.nextLine();

            System.out.print("Please insert operator: ");
            String operator = scanner.nextLine();

            System.out.print("Please insert secondDigit: ");
            float secondDigit = scanner.nextFloat();
            scanner.nextLine();

            float result = calculate(firstDigit, secondDigit, operator);
            System.out.println("Result: " + result);

            System.out.print("New calculation or Stop? ");
            decision = scanner.nextLine();
        } while (!STOP_DECISION.equals(decision));
    }

    private static float calculate(float firstDigit, float secondDigit, String operator) {

        return 0;
    }
}
