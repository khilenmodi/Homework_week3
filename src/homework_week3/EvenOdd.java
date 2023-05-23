package homework_week3;
/**
 *Write a java program that tells us that Input number is odd or even?
 */

import java.util.Scanner;


public class EvenOdd {

     public void k(){ // Instance method created
         Scanner sc = new Scanner(System.in); // scanner is been used
         System.out.println("please enter the Number : ");
         int a = sc.nextInt();
        String num = (a % 2 == 0) ? "even number" : "odd number "; // Ternary operator used
         System.out.println(a + " is " + num );
     }

    public static void main(String[] args) {
         EvenOdd obj = new EvenOdd();
         obj.k();
    }
}
