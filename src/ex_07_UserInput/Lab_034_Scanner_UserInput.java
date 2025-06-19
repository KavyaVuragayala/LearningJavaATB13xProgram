package ex_07_UserInput;

import java.util.Scanner;

public class Lab_034_Scanner_UserInput {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        String vote = (age>18) ? "Yes" : "No" ;
        System.out.println(vote);
    }
}
