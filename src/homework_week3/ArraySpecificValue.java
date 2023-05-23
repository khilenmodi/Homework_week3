package homework_week3;
/**
 * Write a Java program to test if an array contains a specific value.
 */

import java.util.Scanner;

public class ArraySpecificValue {
    public static void contains() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter number ");
        int num = sc.nextInt();

        int[] array1 = {27, 45, 85, 36, 47, 22, 37};
        for (int i = 0; i < array1.length; i++ )
        {
            if (array1[i] == num) {
                int result = num;
                System.out.println(result + " : number is valid");
            }else {
                System.out.println("invalid number");
                break;
            }

        }
    }

             public static void main(String[] args){

                contains();
    }
}

