package Programs;

import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args){

        // without reverse function

        Scanner sc= new Scanner(System.in);
        System.out.println("enter the string");
        String input= sc.next();
        String isPalindrome = reverse(input);

        if(isPalindrome.equalsIgnoreCase(input)){

            System.out.println("is palindrome");
        }
        else {
            System.out.println("not a palindrome");
        }

    }

    static String reverse(String userInput){

        String reverse_input = "";
        for (int i = userInput.length()-1 ; i>=0 ; i--){

            reverse_input = reverse_input + userInput.charAt(i);

        }
        return reverse_input;
    }
}
