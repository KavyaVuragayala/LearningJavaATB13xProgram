package ex_09_IfCondition;

import java.util.Scanner;

public class Lab_039_Ifelsecondition {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Age");
        int age = sc.nextInt();

        if(age>18)
        {
            System.out.println("ELigibile");
        }
        else
        {
            System.out.println("Not ELigibile");
        }
    }
}
