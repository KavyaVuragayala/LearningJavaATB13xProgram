package ex_26_Abstraction_AbstractClass;

public class Lab_114_AC_Ex_Cars {
    public static void main(String[] args) {

        // concept of abstraction is to show only the main data i.e only to drive but not about engine functions and all

        WagonR r = new WagonR();
        r.drive();
      //  Engine e = new Engine();    object of abstract class is not possible

    }
}

abstract class Engine{

    abstract void startEngine();
    abstract void stopEngine();

    void checkEngine(){
        System.out.println("Good !!");
    }
}


class WagonR extends Engine{

    @Override
    void startEngine() {
        System.out.println("Start");
    }

    @Override
    void stopEngine() {
        System.out.println("Stop");
    }

    void drive(){
        checkEngine();
        startEngine();
        stopEngine();
    }
}


