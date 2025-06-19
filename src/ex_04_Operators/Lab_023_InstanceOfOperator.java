package ex_04_Operators;

public class Lab_023_InstanceOfOperator {
    public static void main(String[] args) {
        String s1= new String("Alice");
        System.out.println(s1 instanceof Object);
        System.out.println(s1 instanceof String);
       // System.out.println(s1 instanceof Integer); not allowed
    }
}
