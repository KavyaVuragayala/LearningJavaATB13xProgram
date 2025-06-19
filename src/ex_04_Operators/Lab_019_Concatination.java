package ex_04_Operators;

public class Lab_019_Concatination {
    public static void main(String[] args) {

        String s1 = "Alice";
        String s2= "John";
        System.out.println(s1 + s2);

        int a=10;
        int b=20;
        System.out.println(a+b);

        System.out.println(s1+s2+a+b);  // the first + acts as concatination so the next + also acts as concatination
        System.out.println(s1+s2+(a+b)); // ALiceJohn30
        System.out.println(a+b+s1+s2);  // the first + acts as addition (this is only in the case of integer value )so the next + acts as concatination
    }
}
