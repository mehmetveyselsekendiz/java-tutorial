package tr.mvs.tutorial.java;

import java.util.Scanner;

public class FindBiggestNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter three numbers for comparison: ");

        double number1 = scanner.nextDouble();
        double number2 = scanner.nextDouble();
        double number3 = scanner.nextDouble();

        if (number1 > number2) {
            if (number1 > number3) {
                System.out.print(number1 + " is the biggest number.");
            } else {
                System.out.print(number3 + " is the biggest number.");
            }
        } else if (number2 > number3) {
            System.out.print(number2 + " is the biggest number.");
        } else {
            System.out.print(number3 + " is the biggest number.");
        }
    }
}
