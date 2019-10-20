package tr.mvs.tutorial.java;

/**
 * @author Mehmet Veysel Sekendiz
 * @since 18.10.2019
 */
import java.util.Scanner;

public class FindingAlphabet {
    public static void main(String[] args) {
        char a;
        int count = 0;
        String alphabet;
        a = (char) (65 + (int) (Math.random() * 26));
        //System.out.println(a);

        Scanner scn = new Scanner(System.in);

        while (count < 10) {
            System.out.print("enter a char: ");
            alphabet = scn.nextLine();
            char ch = alphabet.charAt(0);
            count++;

            if (a == ch) {
                System.out.println("You guess true");
                break;
            }
        }
    }
}
