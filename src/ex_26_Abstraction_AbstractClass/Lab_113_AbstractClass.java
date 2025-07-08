package ex_26_Abstraction_AbstractClass;

public class Lab_113_AbstractClass {
    public static void main(String[] args) {

       // Father f = new Father(); // this abstract so we cannot access
        Son s = new Son();
        Father f1= new Son();
        s.loan50k();
        f1.loan50k();
    }
}

class Car{

    // this is a complete method / concrete method
}
abstract class Father{
    // object cant be created
    // incomplete class
    int a=10;  // can be changed
   abstract void loan50k();

   //complete class
   void load2k(){
       System.out.println("Given");
   }

}

class Son extends Father{
 // inorder to extend the father class son has to complete the abstact method to access father methods so we have overrided the void loan50k method

    @Override
   void loan50k(){
        System.out.println("Son will be paying");
    }

}


