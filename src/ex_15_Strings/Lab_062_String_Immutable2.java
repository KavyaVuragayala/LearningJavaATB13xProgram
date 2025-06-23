package ex_15_Strings;

public class Lab_062_String_Immutable2 {
    public static void main(String[] args) {
        String s1= "Hello";
        s1.concat("world");
        System.out.println(s1); // Hello will be printed

        s1= s1.concat("World");
        System.out.println(s1); // HelloWorld
    }
}
