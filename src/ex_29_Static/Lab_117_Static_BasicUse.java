package ex_29_Static;

public class Lab_117_Static_BasicUse {
    public static void main(String[] args) {
        AC a1 = new AC();
        System.out.println(a1.a);    // 10

        AC a2 = new AC();
        System.out.println(a2.a);   // 10

        a2.a = 25;
        System.out.println(a1.a);   // 25

        // concept of static is --> object created to that class will be directly references to variable i.e a
        // if one obj chnages the values other objects will be also changing

    }
}

class  AC{
    static  int a=10;
}
