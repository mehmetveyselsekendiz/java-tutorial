package tr.mvs.tutorial.java;

import java.util.Scanner;
// Mehmet Veysel Sekendiz

public class BigestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three number for comperison: ");
        double n1 = input.nextDouble();
        double n2 = input.nextDouble();
        double n3 = input.nextDouble();

        if (n1 > n2)
        {

            if (n1 > n3) {
                System.out.print(n1 + " is the biggest number");
            }
            else {
                System.out.print(n3 + " is the biggest number");
            }
        }
        else if (n2 > n3)
        {
            System.out.print(n2 + " is the biggest number");
        }
        else{
            System.out.print(n3+ " is the biggest number");


        }
    }
}