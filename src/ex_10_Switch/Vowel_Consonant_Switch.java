package ex_10_Switch;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Vowel_Consonant_Switch {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("enter a character");
        char c= sc.next().charAt(0);//   char ch = sc.next().charAt(0); charAt(0) is used to read the char extracts the first character from that token.
        c = Character.toLowerCase(c);  // inbuilt character. function is there in java
        // char ch= sc.next().toLowercase.charAt(0);

        if(c < 'a'){
            System.out.println("enter a valid character");
            return;
        }

        switch(c){

            case 'a','e','i','o','u' -> System.out.println("Vowel");
            default -> System.out.println("consonant");
        }

    }
}
