package ex_09_IfCondition;

import java.util.Scanner;

public class Grades_Program {
    public static void main(String[] args) {
        /* Grade Calculator:
        Write a program that calculates and displays the letter grade for a given numerical score (e.g., A, B, C, D, or F) based on the following grading scale:
        A: 90-100
        B: 80-89
        C: 70-79
        D: 60-69
        F: 0-59 */
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Marks ");
        int a = sc.nextInt();

        if(a>= 90 && a<=100){
            System.out.println("Grade A");
        } else if (a>=80 && a<90 ) {
            System.out.println("Grade B");
        }else if (a>=70 && a<80 ) {
            System.out.println("Grade C");
        }else if (a>=60 && a<70 ) {
            System.out.println("Grade D");
        }else {
            System.out.println("Grade F");
        }

    }
}
