package ex_21_Inheritance;

public class Lab_102_BasicInheritance {
    public static void main(String[] args) {

        Father f = new Father();
        f.house();
        System.out.println("gold"+f.gold);
        System.out.println("Property"+f.property_sqyrds);

        System.out.println("*****************");

        // son can access all fathers things
        Son s= new Son();
        s.house();
        s.house_son();
        System.out.println(s.gold);
        System.out.println(s.property_sqyrds);

       // f.house_son();  not possible


    }
}

class Father {

    int property_sqyrds = 700;
    int gold = 1000;

    void house() {
        System.out.println("Father owned his 2 BHK flat");
    }
}

class Son extends Father{

    // extends father so son can access all this attributes and behaviour

//    int property_sqyrds = 700;
//    int gold = 1000;
//
//    void house() {
//        System.out.println("Father owned his 2 BHK flat");
//    }
//
    void house_son(){
        System.out.println("Son owned his 3 BHK flat");
    }
}
