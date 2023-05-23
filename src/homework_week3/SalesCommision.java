package homework_week3;
/**
 * Write a java program input sales id, seller's name, sales amount, and salary basic and
 * then fined this sales
 * Commission
 * Sales amount >= 50,000 35%
 * Sales amount >= 30,000 20%
 * >= 20,000 10%
 * >= 10,000 5%
 * < 10,000 2%
 */

import java.util.Scanner;

public class SalesCommision {
            int a = (35/100);
            int b = (20/100);
            int c= (10/100);
            int d = (5/100);

            public static void commission() {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter Amount :");
                double amount = sc.nextDouble();
                System.out.println("Enter Commission percentage :");
                double percentage = sc.nextDouble();
                double commission = (percentage / 100) * amount;
                System.out.println("commission amount =" + commission);
            if(amount>=50000){
                System.out.println(commission*amount);
            } else if (amount>=30000) {
                System.out.println(commission*amount);
            } else if (amount>=20000) {
                System.out.println(commission*amount);
            } else if (amount>=10000) {
                System.out.println(commission*amount);
            }else if (amount<10000){
                System.out.println(commission*amount);
            }

            }

    public static void main(String[] args) {
        commission();
    }
}
