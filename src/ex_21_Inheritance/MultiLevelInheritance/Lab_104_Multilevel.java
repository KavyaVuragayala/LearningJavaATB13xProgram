package ex_21_Inheritance.MultiLevelInheritance;

public class Lab_104_Multilevel {

    // *******************       GrandFather --> Father --> Son     ****************

    public static void main(String[] args) {

        GrandFather gf = new GrandFather();
        System.out.println(gf.god_gf);
        gf.home();

        Father f= new Father();
        f.home();
        GrandFather f1= new Father();
        f1.home();   // father is not having home then GrandFather home will be father home

        GrandFather gf2= new Son();
        Father s1= new Son();
        Son s2= new Son();
        s2.car();
        s1.home(); // father is not having home then GrandFather home will be son home also

    }
}
