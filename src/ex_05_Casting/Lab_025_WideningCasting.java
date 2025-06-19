package ex_05_Casting;

public class Lab_025_WideningCasting {
    public static void main(String[] args) {
        byte a=10;
        int b= a; // implicit casting
        System.out.println(b);

        byte c=20;
        int d= c; // Explicit casting
        System.out.println(d);

        //  Description: Convert int A =100 to double.
        int A=100;
        double D = A ; // implicit as conversion of int --> double is auto
        System.out.println(D);

        //  Description: Typecasts a character to its ASCII integer value. Example Print A ASCII Int value.

        char character= 'A';
        int integer_value = character; // implicit
        System.out.println(integer_value);


    }
}
