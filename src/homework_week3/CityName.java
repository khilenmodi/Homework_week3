package homework_week3;

import java.util.Scanner;

/**
 * Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry
 */
public class CityName {
    private void printCityname(String Alphabet) {
        if (Alphabet.equals("A")) {
            System.out.println("Amritsar");
        } else if (Alphabet.equals("B")) {
            System.out.println("Berlin");
        } else if (Alphabet.equals("C")) {
            System.out.println("chicago");
        } else if (Alphabet.equals("D")) {
            System.out.println("Dehradun");
        } else if (Alphabet.equals("E")) {
            System.out.println("Edinburgh");
        } else if (Alphabet.equals("F")) {
            System.out.println("Frankfurt");
        } else {
            System.out.println("Invalid Alphabet");
        }
    }

    public static void main(String[] args) {
        CityName obj = new CityName();
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Alphabet :");
        String Alphabet =sc.nextLine();
        obj.printCityname (Alphabet);
    }
}

