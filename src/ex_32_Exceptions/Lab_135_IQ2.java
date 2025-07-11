package ex_32_Exceptions;

public class Lab_135_IQ2 {
    public static void main(String[] args) {

        System.out.println("Starting a program");
        try {
            String input_user = args[0]; // passing input from cmd -> edit configurations
            Integer a = Integer.parseInt(input_user);
            Integer output = 100 / a;
        } catch (NumberFormatException | ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
