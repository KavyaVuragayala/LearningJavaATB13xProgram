package ex_07_UserInput;

import java.util.Scanner;

public class Lab_035_Scanner_UserInput_2 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.next();
        System.out.println(str);


        System.out.println("Enter Integer");
        int integer = sc.nextInt();
        System.out.println(integer);



        System.out.println("Enter Double");
        double double_value = sc.nextDouble();
        System.out.println(double_value);
    }
}
