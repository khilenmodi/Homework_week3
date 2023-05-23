package homework_week3;

import java.util.Scanner;

/**
 * Write a program that tells us input value is number or an alphabet or symbol.
 */

public class NumbersOrAlphabetOrSymbol {
    public static void M1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any character :");
        char ch = sc.next().charAt(0); // use for Array indexing
        // using char integer for scanning all the single character, numbers, special symbol
        // using if else if method as well as use special symbol to compare small letter and capital letter
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch >= 'Z')) {
            System.out.println("This is A Alphabet" + ch);
        } else if ((ch >= '0' && ch <= '9')) {
            System.out.println("This is A Digit " + ch);
        } else {
            System.out.println("This is A Special Character");
        }
    }

    public static void main(String[] args) {

        M1();
    }
    }







