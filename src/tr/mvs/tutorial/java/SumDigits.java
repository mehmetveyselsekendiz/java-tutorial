package tr.mvs.tutorial.java;

import java.util.Scanner;

public class SumDigits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number for digit summation: ");

        int number = scanner.nextInt();

        int sum = 0;
        for (int counter = number; counter != 0; counter /= 10) {
            int digit = counter % 10;
            sum += digit;
        }

        System.out.println(sum + " is sum of digits of " + number + ".");
    }
}
