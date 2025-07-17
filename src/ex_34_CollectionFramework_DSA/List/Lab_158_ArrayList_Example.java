package ex_34_CollectionFramework_DSA.List;

import java.util.ArrayList;
import java.util.List;

public class Lab_158_ArrayList_Example {
    public static void main(String[] args) {

        Student s1= new Student("Amit",1);
        Student s2= new Student("John",2);
        Student s3= new Student("Rahul",3);

        // adding details into arrayList
        List<Student> l = new ArrayList();
        // List l1= new List(); --> list is an interface so obj of an interface cannot be created
        l.add(s1);
        l.add(s2);
        l.add(s3);
        System.out.println(l);
        // [ex_34_CollectionFramework_DSA.List.Student@8efb846, ex_34_CollectionFramework_DSA.List.Student@2a84aee7, ex_34_CollectionFramework_DSA.List.Student@a09ee92]
        // will print the reference of each student

        // either you can create a toString method to Override or a separate function to fetch the data
        s1.StudentDetails();
        s2.StudentDetails();
        s3.StudentDetails();



    }
}

class Student{

    private String name;
    private Integer rollno;


    public Student(String name, Integer rollno) {
        this.name = name;
        this.rollno = rollno;
    }


    public Integer getRollno() {
        return rollno;
    }

    public void setRollno(Integer rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollno=" + rollno +
                '}';
    }

    public void StudentDetails( ){
        System.out.println(name);
        System.out.println(rollno);
    }
}
