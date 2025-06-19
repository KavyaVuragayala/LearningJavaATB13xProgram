package ex_04_Operators;

public class Lab_024_InterviewQ {
    public static void main(String[] args) {
        System.out.println('A'== 65);

        short a=10;
        char c= 'A'; // acts as integer
        String s1= "A"; // strings will not act as integer
        System.out.println(a+c); // 75
        System.out.println(c+s1); //AA

    }
}
