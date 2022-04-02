package pl.sdacademy.java.basic.day1;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please insert firstDigit: ");
        int firstDigit = scanner.nextInt();

        System.out.print("Please insert secondDigit: ");
        int secondDigit = scanner.nextInt();

        int sum = sumOfTheSequence(firstDigit, secondDigit);
        System.out.println("Sum: " + sum);
    }

    private static int sumOfTheSequence(int firstDigit, int secondDigit) {
        if(firstDigit > secondDigit) {
            int tmp = firstDigit;
            firstDigit = secondDigit;
            secondDigit = tmp;
        }
        int sum = 0;
        for(int i = firstDigit; i <= secondDigit; i++) {
            sum += i;
        }

//        for(;firstDigit <= secondDigit; firstDigit++) {
//            sum += firstDigit;
//        }

//        while(firstDigit <= secondDigit) {
//            sum +=firstDigit;
//            firstDigit++;
//        }

//        do {
//            sum +=firstDigit;
//            firstDigit++;
//        } while(firstDigit <= secondDigit);

        return sum;
    }

}
