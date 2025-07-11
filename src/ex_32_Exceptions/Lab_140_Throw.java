package ex_32_Exceptions;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lab_140_Throw {
    public static void main(String[] args) {;

        Scanner sc= new Scanner(System.in);
        System.out.println("enter age");
        int age = sc.nextInt();
      //  validateage(age);   // second this method shows and error to validate age so use try catch
        try {
            validateage(age);   // second this method shows and error to validate age so use try catch
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    static void validateage(int age ) throws ArithmeticException, FileNotFoundException,ArrayIndexOutOfBoundsException {
        if(age<18){
            throw new ArithmeticException("You are not eligible to vote "); // at first this shows error so need to handle the exception so add throws Exception in method
        }
    }
}
