package ex_22_Polymorphism.MethodOverRiding;

public class Lab_107_MethodOverRiding {

    // method overriding will be in the same class
    // metho overloading will be in the diff class
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }

}

class Animal{
    void sound(){
        System.out.println("Default Sound");
    }
}
class Dog extends Animal{

    @Override
    void sound(){
        System.out.println("Bark!!!");
    }
}
