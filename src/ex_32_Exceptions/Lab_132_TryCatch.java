package ex_32_Exceptions;

public class Lab_132_TryCatch {
    public static void main(String[] args) {
        System.out.println("1");
        try{
            int a =10/0;
        } catch (ArithmeticException e) {
            System.out.println("ARE YOU FOOL");
        }
        System.out.println("2");
    }
}
