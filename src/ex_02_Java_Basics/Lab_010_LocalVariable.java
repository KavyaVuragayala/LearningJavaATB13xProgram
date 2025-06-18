package ex_02_Java_Basics;

public class Lab_010_LocalVariable {
    public static void main(String[] args) {
        //anything that is declared inside a method / funtion then they are local variables

        int a = 10;
        char b = 'B' ;
        float f= 134f;
        double d= 134.34 ;
        long l= 349489476387l;

        int c = 100;
        {
            int p = 200;
            System.out.println(p);// stays inside int c=100 function itself
        }
        int p= 400;
        System.out.println(p);
    }
}
