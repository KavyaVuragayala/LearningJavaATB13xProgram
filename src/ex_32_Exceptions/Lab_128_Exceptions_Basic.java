package ex_32_Exceptions;

public class Lab_128_Exceptions_Basic {

    //                                         Unchecked Exception
    public static void main(String[] args) {
        System.out.println("Starting a program");
        String input_user = args[0]; // passing input from cmd -> edit configurations
        Integer a = Integer.parseInt(input_user);
        Integer output = 100/ a;      // a = 10 the output is 10
        // if no elements is passed then                           java.lang.ArrayIndexOutOfBoundsException
        // a=0                                                     java.lang.ArithmeticException: / by zero
        // any string is passed in place of an integer then        java.lang.NumberFormatException: For input string: "alice"
        System.out.println(output);

    }
}
