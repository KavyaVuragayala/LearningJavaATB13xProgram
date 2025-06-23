package ex_014_Functions;

public class Lab_055_SimpleMethods {

    static void main()                    // can print but doesnot return anything
    {
        System.out.println("this is a static method which doesnt return anything");
    }

    static int return_int()               // same with float. double etc
    {
        System.out.println("will return integer");
        return 10;
    }

    static boolean return_boolean()
    {
        System.out.println("will return a boolean value");
        return true;
    }

    static String return_string()
    {
        System.out.println("will return string");
        return "return_A_string";
    }
}
