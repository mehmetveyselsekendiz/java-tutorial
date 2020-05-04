package tr.mvs.tutorial.java;

import java.util.Scanner;

public class GuessCharacter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char randomCharacter = (char) (65 + (int) (Math.random() * 26));

        int guessLimit = 10;
        System.out.println("Guess limit is " + guessLimit + ".");

        int counter = 0;
        while (counter < guessLimit) {
            System.out.print("Type a character: ");
            String string = scanner.nextLine();

            char character = string.charAt(0);

            counter++;

            if (randomCharacter == character) {
                System.out.println("Your character guess is true.");
                break;
            }
        }
    }
}
