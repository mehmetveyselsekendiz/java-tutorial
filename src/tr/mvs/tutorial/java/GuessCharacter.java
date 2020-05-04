package tr.mvs.tutorial.java;

import java.util.Scanner;

public class GuessCharacter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char randomCharacter = (char) (65 + (int) (Math.random() * 26));

        int counter = 0;
        while (counter < 10) {
            System.out.print("Type a character: ");
            String string = scanner.nextLine();

            char character = string.charAt(0);

            counter++;

            if (randomCharacter == character) {
                System.out.println("Your guess is true.");
                break;
            }
        }
    }
}
