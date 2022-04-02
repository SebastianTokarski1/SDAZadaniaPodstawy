package pl.sdacademy.java.basic.day1;

import java.util.Scanner;

public class Task2 {
    private static final float PI = 3.14F;

    public static void main(String[] args) {
        float radius = getDiameterFromUser() / 2;
        float circumference = calculateCircumferenceOfACircle(radius);
        float area = calculateAreaOfACircle(radius);
        System.out.println("Circumference of a circle: " + circumference);
        System.out.println("Area of a circle: " + area);
    }

    private static float getDiameterFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please insert diameter: ");
//        float diameter = scanner.nextFloat();
//        return diameter;
        return scanner.nextFloat();
    }

    private static float calculateCircumferenceOfACircle(float radius) {
        return 2 * (float)Math.PI * radius;
        //return 2 * PI * radius;
    }

    private static float calculateAreaOfACircle(float radius) {
        return (float) (Math.PI * Math.pow(radius, 2));
        //return PI * radius * radius;
    }
}
