package homework_week3;

/**
 * Write a java program to print the numbers between 1 to 100 which can be divided by 3
 * and 5 separately.
 */

public class DivisibleNumberBY3And5 {

    public static void numbers() {
        System.out.println("The number Divided by 3 :");
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0)
                System.out.print(i + ",");
            }

            System.out.println("\nThe numbers Divided by 5 :");
                for (int j = 1; j< 100; j++) {
                    if (j % 5 == 0)
                        System.out.print(j + ",");
                    }
                }
            public static void main (String[]args){

        numbers();
        }
    }

