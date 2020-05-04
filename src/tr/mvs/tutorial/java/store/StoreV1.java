package tr.mvs.tutorial.java.store;

import java.util.Locale;
import java.util.Scanner;

public class StoreV1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("****** Store Inventory Entry ******");

        System.out.print("Enter the product name: ");
        String name = scanner.next();

        System.out.print("Enter the number of " + name + ": ");
        int count = scanner.nextInt();

        if (count < 0) {
            System.out.println("ERROR: product number cannot be negative, setting to positive value.");
            count = Math.abs(count);
        }

        System.out.print("Enter the unit cost of " + name + ": ");
        float unitCost = scanner.nextFloat();
        if (unitCost < 0) {
            System.out.println("ERROR: product unit cost cannot be negative, setting to positive value.");
            unitCost = Math.abs(unitCost);
        }

        System.out.println("****** Customer Entry ******");
        System.out.println("Welcome to our store!");
        System.out.println("We have " + count + " unit(s) of " + name + ".");
        System.out.print("How many would you like: ");

        int demanded = scanner.nextInt();
        if (count < demanded) {
            System.out.println("ERROR: We do not have that many remaining.");
        } else if (demanded >= 1) {
            double cost = demanded * unitCost;
            count -= demanded;

            System.out.println("Your cost is " + cost + ". Thank you for shopping with us today.");
        } else if (demanded == 0) {
            System.out.println("ERROR: you have to demand at least one of " + name + ".");
        } else {
            System.out.println("ERROR: demanded value must be positive.");
        }

        System.out.println("We have " + count + " unit(s) of " + name + " remaining.");
    }
}
