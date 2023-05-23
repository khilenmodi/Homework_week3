package homework_week3;
/**
 * 10.Write a java program to input any two number and ask user to enter their symbol (+, -,
 * /, *) find addition, Subtraction, multiplication and division according to their symbol
 * (using if else)
 */

import java.util.Scanner;

public class InputTwoNumber {
    int value1, value2 = 0;

    public static void M1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any First value  :");
        int value1 = sc.nextInt();
        System.out.println("Enter any second value  :");
        int value2 = sc.nextInt();
        System.out.println("Please enter the symbol  : ");
        String sym = sc.next();
        if (sym.equals("+")) {
            int res = value1 + value2;
            System.out.println("Addition of two number is :" + res);
        } else if (sym.equals("-")) {
            int res1 = value1 - value2;
            System.out.println("Substraction of two number is :" + res1);
        } else if (sym.equals("/")) {
            int res2 = value1 / value2;
            System.out.println("Division of two number is  :" + res2);
        } else if (sym.equals("*")) {
            int res3 = value1 * value2;
            System.out.println("Multiplication of two number is  :" + res3);
        } else {
            System.out.println("Invalid symbol");
        }
    }

         public static void main(String[] args){
            M1();
        }
    }
