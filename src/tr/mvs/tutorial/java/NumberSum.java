package tr.mvs.tutorial.java;
/**
 * @author MVS
 * @since 26.10.2019
 */

import java.util.Scanner;
public class NumberSum {
    public static void main(String[] args){
        Scanner scn= new Scanner(System.in);
        System.out.print("Enter a number for calculation: ");
        int a= scn.nextInt();
        int i, j, k;
        int sum=0;
        
        for(i=1; i<=a; i++){
            for(j=i; j!=0; j=j/10 ){
                k=j%10;
                sum+=k;
                j=j-k; 
            }
            System.out.println(i+" >> "+sum);
            sum=0;
        }
    }
}
