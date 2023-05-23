package homework_week3;

import java.util.Scanner;

/**
 * Write a method isLeapYear with a parameter of type int named year.
 * The parameter needs to be greater than or equal to 1 and less than or equal to 9999.
 * If the parameter is not in that range return false.
 * Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is,
 * otherwise return false.
 * A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400.
 */

public class LeapYearAndMonths {
    public boolean isLeapYear(int year) {
        boolean validYear = year >= 1 && year <= 9999;
        if (validYear) {
            boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
            return isLeapYear;
        } else {
            return false;
        }
    }

    /**
     * Write another method getDaysInMonth with two parameter month and year. Both of type
     * int.
     * If parameter month is < 1 or >12 return -1.
     * If parameter year is <1 or >9999 than return -1.
     * This method needs to return the number of days in the month. Be careful about leap years
     * they have 29 days in month 2 (February).
     * You should check if the year is a leap year using the method isLeapYear describe above.
     *
     */
    public int getDaysInMonths( int month, int year){
        boolean validMonth = month >=1 && month <=12;
        boolean validYear = year >=1 && year<=9999;
        if (validMonth && validYear){
            switch (month){
                case 1 :
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    return 31;
                case 2:
                    boolean isLeapYear = isLeapYear(year);
                    if (isLeapYear){
                        return 29;
                    }else {
                        return 28;
                    }
                case 4:
                case 6:
                case 9:
                case 11:
                    return 30;
            }
            }else {
            return -1;
        }
        return -1;

    }

    public static void main(String[] args) {
        LeapYearAndMonths obj = new LeapYearAndMonths();
        Scanner sc= new Scanner(System.in);
        System.out.println("please Enter the Year : ");
        int year = sc.nextInt();

        boolean isLeapYear  = obj.isLeapYear(year);
        System.out.println("This is a leap Year :" + isLeapYear);
        System.out.println("Please Enter the Months :");
        int month = sc.nextInt();

        int daysOfMonth = obj.getDaysInMonths(month,year);
        System.out.println("days of Month :" + daysOfMonth);
    }
}

