package homework_week3;
/**
 * Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
 * “ZERO”
 */

import java.util.Scanner;

public class PositiveNegativeZero {
    int a;
    public void number(){
        Scanner sc= new Scanner(System.in);
        int a =sc.nextInt();
        if (a>0){
            System.out.println("This is a Positive Number  :");
        } else if (a < 0) {
            System.out.println("This is a Negative Number  :");
        }else{
            System.out.println("This number is zero");
        }
    }

    public static void main(String[] args) {
        PositiveNegativeZero obj = new PositiveNegativeZero();
        obj.number();
    }
}
