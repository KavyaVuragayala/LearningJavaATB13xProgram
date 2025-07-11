package ex_32_Exceptions;

public class Lab_137_TryCatchFinally {
    public static void main(String[] args) {
        int a=1;
        int c=0;
        try {
            c=10/0;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
           // e.fillInStackTrace();
        } finally {
            System.out.println("finally block will be executed if the above code executes or not");
        }
    }
}
