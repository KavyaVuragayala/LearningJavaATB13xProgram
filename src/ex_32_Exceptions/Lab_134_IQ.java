package ex_32_Exceptions;

public class Lab_134_IQ {
    public static void main(String[] args) {

        // handling 2 exceptions at once

        try {
            String a= null;
            Integer b= 10/0;
         } catch (NullPointerException | ArithmeticException e) {
            System.out.println("Null or Arithmetic error");
        }
        System.out.println("End");
    }
}
