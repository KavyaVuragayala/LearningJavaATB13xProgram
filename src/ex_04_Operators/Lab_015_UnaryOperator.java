package ex_04_Operators;

public class Lab_015_UnaryOperator {
    public static void main(String[] args) {

        int a= +10; // same as int a=10
        int b = -10;  // + and - are unary operators here
        int c= a+b;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        int d =-1;
        d = d+1;
        System.out.println(d);
    }
}
