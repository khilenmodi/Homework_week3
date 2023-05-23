package homework_week3;

import java.util.Scanner;

/**
 * Input any alphabet from “A" to “F” and print their city name accordingly if
 * any other alphabet should be invalid entry
 * Same as above program-8 using switch statement.
 */
public class AlphabetSwitchStatement {

    private void  cityname (String Alphabet){
        switch (Alphabet){
            case "A" :
                System.out.println("Amritsar");
                break;
            case "B":
                System.out.println("Berlin");
                break;
            case "C":
                System.out.println("Chicago");
                break;
            case "D":
                System.out.println("Dehradun");
                break;
            case "E":
                System.out.println("Edinburgh");
                break;
            case "F":
                System.out.println("Frankfurt");
                break;
            default:
                System.out.println("Invalid Alphabet");
                break;
        }
    }

    public static void main(String[] args) {
        AlphabetSwitchStatement obj= new AlphabetSwitchStatement();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Alphabet Between A and F");
        String Alphabet =sc.nextLine();
        obj.cityname(Alphabet);
    }
}
