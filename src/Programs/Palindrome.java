package Programs;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        boolean isPalindrome = true;

        String s= sc.next();
        for(int i=0; i<s.length() / 2 ;i++)
        {
            if(s.charAt(i)!=s.charAt(s.length()-1-i ))
            {
                isPalindrome = false;
                break;
            }

        }

        if(isPalindrome)
        {
            System.out.println("is a palindrome");
        }
        else
        {
            System.out.println("not a palindrome");
        }

            }
}
