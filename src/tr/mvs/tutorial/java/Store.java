package tr.mvs.tutorial.java;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author Mehmet Veysel Sekendiz
 * @since 17.10.2019
 */

// This program is a Store Application for a given product.
public class Store {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		System.out.println("****** Store Inventory Entry ******");
		
		System.out.print("Enter the product name: ");
		String productName = scanner.next();
		
		System.out.print("Enter the number of " + productName + " we have: ");
		int productNumber = scanner.nextInt();
		if (productNumber < 0) {
			System.out.println("ERROR: value cannot be negative, setting to " + "positive value ");
			productNumber = Math.abs(productNumber);
		}
		
		System.out.print("Enter the cost of " + productName + ": ");
		float productCost = scanner.nextFloat();
		if (productCost < 0) {
			System.out.println("ERROR: value cannot be negative, setting to " + "positive value ");
			productCost = Math.abs(productNumber);
		}

		System.out.println("\n****** Customer Entry ******");
		System.out.print("Welcome to our store, we have " + productNumber + " of " + productName + " remaining.\nHow many would you like? ");
		int productNumberAsked = scanner.nextInt();

		if (productNumber < productNumberAsked) {
			System.out.println("ERROR: we do not have that many remaining");
			System.out.println("We have " + productNumber + " of " + productName);
		} else if (productNumberAsked >= 1) {
			System.out.println("Your cost is " + productNumberAsked * productCost);
			System.out.println("Thank you for shopping with us today.\nWe now " + "have " + (productNumber - productNumberAsked) + " of " + productName + " remaining.");
		} else if (productNumberAsked == 0) {
			System.out.println("EROR: you have to buy at least 1 of " + productName);
			System.out.println("We have " + productNumber + " of " + productName);
		} else {
			System.out.println("EROR: must be positive");
			System.out.println("We have " + productNumber + " of " + productName);
		}
	}
}