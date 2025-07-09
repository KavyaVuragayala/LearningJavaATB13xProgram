package ex_29_Static;

public class Lab_121_WebAuto_Static {
    public static void main(String[] args) {

        Automation a = new Automation();
        System.out.println(a.driver);

        Automation a1 = new Automation();
        Automation a2 = new Automation();
        System.out.println(a1.driver);
        System.out.println(a2.driver);

    }
}

class Automation{

    static String driver = "Chrome";
}
