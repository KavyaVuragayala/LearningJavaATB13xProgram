package ex_25_SuperKeyword;

public class Lab_112_SuperKeyword {
    public static void main(String[] args) {

      //  Vehicle vc= new Car();
        Vehicle vc1= new Car(10);
    }
}

class Vehicle{

    public int max_speed= 180;

    Vehicle(){
        System.out.println("Default Const");
    }

    Vehicle(int a){
        System.out.println("Parameterized Const");
    }

    void display(){
        System.out.println("Display Parent");
    }
}

class Car extends Vehicle{
     int max_speed= 284;

     Car(){
         super();       // the default const of parent
     }

     Car(int a) {
         super(10);   // the parameterized const of parent
     }

    void display(){

         this.max_speed=max_speed;
         System.out.println(max_speed);   // this keyword is used to print the self method values

         System.out.println(super.max_speed);    // it will print parent class max_speed
     }
}