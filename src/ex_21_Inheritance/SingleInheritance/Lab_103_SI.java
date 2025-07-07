package ex_21_Inheritance.SingleInheritance;

public class Lab_103_SI {
    public static void main(String[] args) {

        TC1 tc1= new TC1();
        tc1.running();

        System.out.println("***************************");

        TC2 tc2 = new TC2();
        tc2.running();

        CommonToAll tc3= new TC1(); //  Dynamic Dispatch
    }

}
