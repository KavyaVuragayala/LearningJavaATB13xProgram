package ex_29_Static;

public class Lab_119_Static {
    public static void main(String[] args) {
        A ref1 = new A(10);  //10
        A ref2 = new A(11);  // 11
        System.out.println(ref1.a);  //10
        System.out.println(A.b); //50  we are directly accessing the static variable using A.b
        System.out.println(ref2.a);   // 11

        System.out.println(ref1.b);  //50
        System.out.println(ref2.b);  //50

        ref1.display();
        ref2.display();

        A.staticMethod();
    }
}

class A{
    int a; // non-static - instance variable
    static int b = 50; // static and shared btw objects

    A(int a){
        this.a =a;
    }
    void display(){
        System.out.println(this.a);   //ref1--->10        ref2--->11
        System.out.println(this.b);  // static variable in instance variable i allowed

    }
    static void staticMethod(){
        System.out.println("will be called when class is loaded");
       // System.out.println(this.a);    static methods cannot access non-static variables
    }
}
