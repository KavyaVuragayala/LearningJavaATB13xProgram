package Programs;
import java.util.Scanner;

public class Leap_Year_Checker {
    public static void main(String[] args) {

        /*  Leap Year Checker:
        Create a program that determines whether a given year is a leap year.
        A leap year is divisible by 4, but not by 100 unless it is also divisible by 400.
        Use an if-else statement to make this determination.*/
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a year");
        int year = sc.nextInt();

        if(((year % 4==0) && (year % 100 !=0) )|| (year % 400 ==0) )
        {
            System.out.println("Leap Year");
        }
        else
        {
            System.out.println("Not a Leap Yeap");
        }

    }
}
