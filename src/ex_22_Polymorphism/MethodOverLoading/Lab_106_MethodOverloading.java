package ex_22_Polymorphism.MethodOverLoading;

public class Lab_106_MethodOverloading {
    public static void main(String[] args) {

        MathOperations m= new MathOperations();
        System.out.println(m.add(3,4));
        System.out.println(m.add(3,4,5));
        System.out.println(m.add(3.1,4.34));
        System.out.println(m.add("Alice","John"));
        // based on parameters we have to decide which parameters to be passed

    }
}

class MathOperations{
    // same name but diff parameters and diff return types

    int add(int a, int b){
        return a+b;
    }

    int add(int a ,int b, int c){
        return a+b+c;
    }

    double add(double a,double b){
        return a+b;
    }
    String add(String a,String b){
        return a+b;
    }
}
