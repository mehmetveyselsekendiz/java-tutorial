package tr.mvs.tutorial.java;

/**
 * @author Mehmet Veysel Sekendiz
 * @since 10.10.2019
 */

import java.util.Scanner;

public class FindingRoots {
    public static void main( String[] args){
        Scanner scn= new Scanner ( System.in);
        double a, b, c, d;
        System.out.println("Enter the values of second order eqn: ");
        a= scn.nextDouble(); // ax^2+bx+c is our second order eqn
        b= scn.nextDouble();
        c= scn.nextDouble();
        d= (b*b)-(4*a*c); //This value is delta
        if (d>= 0){
            System.out.println("This eqn has root or roots");
            System.out.println((-b+Math.sqrt(d))/(2*a)+ " is a root");
            System.out.println((-b-Math.sqrt(d))/(2*a)+ " is a root");
        }
        else {
            System.out.println("This eqn has no real roots");
        }

    }
}
