package ex_32_Exceptions;

public class Lab_131_HandleException {
    public static void main(String[] args) {
        int a=0;
        try {
            a=10/0;   //java.lang.ArithmeticException: / by zero
        } catch (Exception e) {
            System.out.println("Divide by 0 is not allowed");
        }
        System.out.println(a);
    }
}
