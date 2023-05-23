package homework_week3;
/**
 * Write a Java program to calculate the average value of array elements.
 */

import java.util.Scanner;

public class AvarageValueOfArray {
    int num;
    int add =0;
    public void avg() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of Array  :");
        num = sc.nextInt();
        int a[] = new int[num];
        for (int i = 0; i < num; i++) {
            System.out.println("a [" + i + "]");
            a[i] = sc.nextInt();
            add = add + a[i];
        }
        int avg1 = add / a.length;
        System.out.println("Avg  of Array : " + avg1);
    }



    public static void main(String[] args) {
        AvarageValueOfArray sc =new AvarageValueOfArray();
        sc.avg();
    }
}
