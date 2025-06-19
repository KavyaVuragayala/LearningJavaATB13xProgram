package ex_11_ForLoop;
import java.util.Scanner;

public class Lab_045_EvenOdd {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter a number from 1-50");
//        int number = sc.nextInt();

        for(int i=1; i<=50 ; i++)
        {
            if(i%2==0)
            {
                System.out.println(i +  "is even");
            }
//            else
//            {
//                System.out.println(i + "odd");
//            }
        }
    }
}