package homework_week3;
/**
 * Write a Java program to sum values of an array.
 */

import java.util.Scanner;

public class ArraySumValue {

    public static void sum() {
        Scanner input  = new Scanner(System.in);
        System.out.println(" Enter number of 5 value  ");
        double myArray[]= new double[5];
        for (int i= 0; i < myArray.length; i++){
            myArray[i]= input.nextInt();
            System.out.println("the value are :" + myArray[i]);
        }
        int sum =0;
        for (int i = 0; i < myArray.length; i++ ){
            sum += myArray[i];
        }
        System.out.println("The sum of the value is :" + sum );
    }

    public static void main(String[] args) {
        sum();
    }
}
