package homework_week3;
/**
 * Write a java program to input any number and find out if it’s odd or even
 */

import java.util.Scanner;

public class OddOrEven {

            public static void m1(){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter any number  :");
                int a= sc.nextInt();
                if (a%2==0){
                    System.out.println("This is Even Number :" + a);
                }else
                {
                    System.out.println("This is Odd Number  :" +a);
                }
            }

    public static void main(String[] args) {
        OddOrEven obj= new OddOrEven();
        obj.m1();
    }
}
