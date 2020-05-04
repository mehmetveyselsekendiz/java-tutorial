package tr.mvs.tutorial.java;

import java.util.Scanner;

public class TestValidNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number for validation test: ");

        int number = scanner.nextInt();

        int sum = 0;
        for (int counter = 1; counter < number; counter++) {
            if (number % counter == 0) {
                sum = sum + counter;
            }
        }
        if (number == sum) {
            System.out.println(number + " is a valid number.");
        } else {
            System.out.println(number + " is not a valid number.");
        }
    }
}
