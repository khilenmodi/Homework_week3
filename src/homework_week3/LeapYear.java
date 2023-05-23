package homework_week3;
/**
 * Write a java program to input any year like (ex.2007) and find out if it is leap year or
 * not?
 */

import java.util.Scanner;

public class LeapYear {

    public void m1(){ // instance method
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a year :");
        int year  = sc.nextInt();
         String result = (year % 4 == 0) ? "Leap Year" : "Not Leap Year"; // use ternary operator
        System.out.println(year + " is " +result);
    }

    public static void main(String[] args) { // main method
        LeapYear obj = new LeapYear(); // object created due to instance method
        obj.m1();
    }
}
