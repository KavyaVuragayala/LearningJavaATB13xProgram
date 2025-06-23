package ex_09_IfCondition;

import java.util.Scanner;

public class Vowel_Consonant_IfElse {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a character");
        char ch = sc.next().charAt(0);
        // char ch= sc.next().toLowercase.charAt(0);
     //   boolean c = Character.isLowerCase(ch);
        ch = Character.toLowerCase(ch);

        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            System.out.println("vowel");
        }
        else if (ch <'a') {
            System.out.println("Enter a character not integer");

        }
        else {
            System.out.println("consonant");
        }


    }
}
