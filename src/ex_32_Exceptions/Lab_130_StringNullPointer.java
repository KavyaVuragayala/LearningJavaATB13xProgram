package ex_32_Exceptions;

public class Lab_130_StringNullPointer {
    public static void main(String[] args) {
        String name = null;
        name.trim();   //  java.lang.NullPointerException: Cannot invoke "String.trim()" because "name" is null
    }
}
