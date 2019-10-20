package tr.mvs.tutorial.java;

/**
 * @author Mehmet Veysel Sekendiz
 * @since 18.10.2019
 */
import java.util.Scanner;

public class FindingValidNumber {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int a;
        int sum = 0;
        int i;
        System.out.print("Enter a number for validation test: ");
        a = scn.nextInt();
        for (i = 1; i < a; i++) {
            if (a % i == 0) {
                //System.out.println(i);
                sum = sum + i;
            }
        }
        if (a == sum) {
            System.out.println(a + " is a valid number.");
        }
        else {
            System.out.println(a + " is not a valid number.");
        }
    }
}