package ex_19_OOPs;

public class Lab_095_Cats {

    Lab_095_Cats(){
        System.out.println("this is a default constructor clas");
    }

    public static void main(String[] args) {

        Cat c1 = new Cat();
        c1.run();
        Cat c2;
       // c2.run(); its shows an error because only the reference is ben crtd

        new Cat().run();
    }
}

class Cat{

    String name ;

    void run(){
        System.out.println("running");
    }
}

class dog{
}
