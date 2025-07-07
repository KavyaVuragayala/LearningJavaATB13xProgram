package ex_20_Constructor;

 // ************************************* DEFAULT CONSTRUCTOR ****************************************

public class Lab_100_Const_P1 {
    public static void main(String[] args) {

        Car c1 = new Car();
        System.out.println(c1.name);
        System.out.println(c1.year);
        System.out.println(c1.model);
        
        Car c2 = new Car();
        c2.name= "Verna";
        System.out.println(c2.name);
        System.out.println(c2.year);
        System.out.println(c2.model);

    }
}

class Car{

    String name;
    int year;
    String model;

    Car(){

        name ="Creta" ;
        year = 1991;
        model = "XUV";
    }

}
