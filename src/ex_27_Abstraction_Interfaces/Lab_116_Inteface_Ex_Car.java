package ex_27_Abstraction_Interfaces;

public class Lab_116_Inteface_Ex_Car {
    public static void main(String[] args) {
        Car testla = new Car();
        testla.drive();
    }
}









interface Engine {

     void startEngine();                     // by default this is an abstract and public method
     void stopEngine();
}

interface Brakes{
    void applyBrake();
}

class Car implements Engine,Brakes{                            // multiple inheritance is allowed with interface class

    void drive(){
        startEngine();
        applyBrake();
        stopEngine();
    }

    @Override
    public void startEngine() {
        System.out.println("Start Engine");
    }

    @Override
    public void applyBrake() {
        System.out.println("Applied Brake");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stop Engine");
    }
}




