package ex_21_Inheritance.HierarchicalInheritance;

//                                                    Father
//                                            Son               Daughter

public class Lab_105_HI {
    public static void main(String[] args) {

        Father f = new Father();
        f.home();
        Son1 s= new Son1();
        Father s1= new Son1();
        s.home();
        Daughter d= new Daughter();
        Father d1= new Daughter();
        d.home();

        // Son1 s2= new Daughter(); not possible

    }
}

class Father{
    void home(){
        System.out.println("Father's home");
    }
}

class Son1 extends Father{

    void son1(){
        System.out.println("Son1");
    }
}

class Daughter extends Father{

    void daughter(){
        System.out.println("Daughter");
    }
}