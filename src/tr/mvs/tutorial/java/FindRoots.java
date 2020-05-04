package tr.mvs.tutorial.java;

import java.util.Scanner;

public class FindRoots {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ax^2+bx+c is second order equation.");
        System.out.println("Enter the values of second order equation: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double delta = (b * b) - (4 * a * c);

        if (delta >= 0) {
            System.out.println("This equation has real root(s).");

            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);

            System.out.println(root1 + ", " + root2 + " are roots.");
        } else {
            System.out.println("This equation has no real roots.");
        }
    }
}
