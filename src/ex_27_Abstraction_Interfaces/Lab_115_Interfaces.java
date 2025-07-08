package ex_27_Abstraction_Interfaces;

public class Lab_115_Interfaces {
    public static void main(String[] args) {

        Square s = new Square();
        s.getArea(10,20);

        Rectangle r= new Rectangle();
        r.getArea(4,3);               // we see only rectangle and square functions but not Polygon function
    }
}

interface Polygon{

    int a =10; // by default this is final in interfaces so cannot be changed

    void getArea(int l , int b);
    // by default inteface classes are incomplete methods also it doesnt allow complete classes
   // void complete(){}
    // possible with default and static viod
    default void complete(){
        System.out.println("hi");
    }
    static void complete1(){
        System.out.println("hello");
    }

    // abstarct class allows complete methods
}

class Square implements Polygon{

    @Override
    public void getArea(int l , int b){
        System.out.println("Area is " + 3.14*l*b);
    }
}

class Rectangle implements Polygon{

    @Override
    public void getArea(int l , int b){
        System.out.println("Area is " + 3.14*l*b);
    }
}
