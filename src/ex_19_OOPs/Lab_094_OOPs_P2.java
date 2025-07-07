package ex_19_OOPs;

// there should be only one public class and n no.of classes

public class Lab_094_OOPs_P2 {

    public static void main(String[] args) {

        Student s1= new Student(); // object creation
        Student s2;                // only the reference is created not the object
        new Student(); // another type of object creation

        s1.read();

    }
}


class Student {

    String name;

    Student() {
        System.out.println("this is a default constructor");

    }


    void read() {

        System.out.println("students can read");
    }

}
