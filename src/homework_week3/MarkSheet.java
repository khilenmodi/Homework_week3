package homework_week3;
/**
 * Write a java program to input student Name, roll No, and three subjects Math, Science and
 * English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
 * Input, Marks should between 0 to 100”) and find out total, percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
 * %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 */

import java.util.Scanner;

public class MarkSheet {

    public  void m1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the Name :");
        String name = sc.next();
        System.out.println("Enter the Roll Number :");
        int Rollno = sc.nextInt();
        System.out.println("Enter the Maths marks :");
        int Maths = sc.nextInt();
        if (Maths < 0 || Maths > 100) {
            System.out.println("Invalid input, Marks should be between 0 to 100");
            return;
        }
        System.out.println("Enter the Science Marks :");
        int Science = sc.nextInt();
        if (Science < 0 || Science > 100) {
            System.out.println("Invalid Input, Marks should be between 0 to 100");
            return;
        }
        System.out.println("Enter the English Marks  :");
        int English = sc.nextInt();
        if (English < 0 || English > 100) {
            System.out.println("Invalid Input, Marks should be betwwen 0 to 100");
            return;
        }
        System.out.println(" ________________________________");
        System.out.println("|                                |");
        System.out.println("|          Mark Sheet            |");
        System.out.println("|________________________________|");
        System.out.println("|    Name      :  " + name + "         |");

        System.out.println("|    Roll Number  :  " + Rollno + "          |");
        System.out.println("|________________________________|");
        System.out.println("|    Subject     :   Marks       |");
        System.out.println("|________________________________|");
        System.out.println("|    Math        :     " + Maths + "        |");

        System.out.println("|    Science     :    " + Science + "         |");

        System.out.println("|    English     :     " + English + "        |");


        System.out.println("|________________________________|");
        int total = Maths + Science + English;
        System.out.println("|   Total        :" + total + "            |");
        System.out.println("|________________________________|");
        double percentage = total / 3;
        System.out.println("|________________________________|");
        System.out.println("|   Percentage   :" + percentage + "           |");
        String result = passorfail(percentage);
        System.out.println("|   Result       :" + result + "           |");
        String grade = grade(percentage);
        System.out.println("|   Grade        :" + grade + "             |");
        System.out.println("|________________________________|");
    }
        public String passorfail(double percentage) {
            boolean ispass = percentage >= 35;
            if (ispass) {
                return "pass";
            } else {
                return "Fail";
            }
        }
        public String grade(double percentage) {
         boolean grade80 =percentage>=80;
         boolean grade60 = percentage >=60;
         boolean grade50 = percentage >=50;
         boolean grade35 = percentage >=35;
            if (grade80){
                return "A+";
            } else if (grade60) {
                return "A";
            } else if (grade50) {
                return "B";
            } else if (grade35) {
                return "C";
            }else {
                return "Fail";
            }

        }

    public static void main(String[] args) {
        MarkSheet obj = new MarkSheet();
        obj.m1();

    }

}
