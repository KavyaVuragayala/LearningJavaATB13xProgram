package ex_014_Functions;

public class Lab_057_AllUserDefinedFunctions {
    public static void main(String[] args) {
        wop_wor();
        wop_wr();
        wp_wor(3,4);
        all_types("Rani",23,40000.255);
        float result = wp_wr(10.25f,20.567f);
        System.out.println(result);
        String s3= wp1_wr1("Alice","John");
        System.out.println(s3);

    }

    /* 1. Without Parameters and Without Return Type.
       2. Without Parameters but With Return Type
       3. With Parameters and Without Return Type
       4. With Parameters and With Return Type.
*/
    static void wop_wor()
    {
        System.out.println("Without Parameters and Without Return Type");
    }

    static int wop_wr()
    {
        System.out.println("Without Parameters but With Return Type");
        return 209;
    }

    static void wp_wor(int a, int b)
    {
        System.out.println("With Parameters and Without Return Type");
        System.out.println(a+b);
    }

    static void all_types(String str , int x1, double y1)      //With Parameters and Without Return Type
    {
        System.out.println("My name is \t " + str + "\n Age is \t" + x1 + " \n My Salary is \t" + y1);
    }

    static float wp_wr(float x, float y)
    {
        System.out.println("With Parameters and With Return Type");
        return x+y;
    }

    static String wp1_wr1(String s1 , String s2)
    {
        System.out.println("Concatination of 2 strings");
        return s1+s2;
    }

}
