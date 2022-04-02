package pl.sdacademy.java.basic.day1;

public class Task6 {

    public static void main(String[] args) {
        printMultiplicationTable(6, 2 ,5);
    }

    private static void printMultiplicationTable (int multiplier, int minMultiplicand, int maxMultiplicand) {
//        for(int i = minMultiplicand; i <= maxMultiplicand; i++) {
//            int result = multiplier * i;
//            System.out.println(multiplier + " x " + i + " = " + result);
//        }
        while(minMultiplicand <= maxMultiplicand) {
            int result = multiplier * minMultiplicand;
            System.out.println(multiplier + " x " + minMultiplicand + " = " + result);
            minMultiplicand++;
        }
    }
}
