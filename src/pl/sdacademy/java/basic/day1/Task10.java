package pl.sdacademy.java.basic.day1;

import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please insert digit: ");
        int number = scanner.nextInt();
        System.out.println("Sum Of Digits: " + sumOfDigits(number));
    }

    public static int sumOfDigits(int number) {
        int sum = 0;
        if(number > 9) {
            while (number != 0) {
                /*
                aby rozpatrywać liczbę cyfra po cyfrze, możemy obliczać resztę z dzielenia liczby
                przez 10 (aby uzyskać wartość ostatniej cyfry) i dzielić liczbę bez reszty przez 10 (żeby przesuwać
                się do kolejnej cyfry)
                 */
                sum += number % 10;
                number /= 10;
            }
        } else {
            sum = number;
        }

        /*if(number > 9) {
            do {
                sum += number % 10;
                number /= 10;
            } while (number != 0);
        } else {
            sum = number;
        }*/

        return sum;
    }
}