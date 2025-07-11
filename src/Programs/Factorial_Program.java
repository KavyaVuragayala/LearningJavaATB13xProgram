package Programs;

import java.util.Scanner;

public class Factorial_Program {
    public static void main(String[] args) {
        // Factorial Program
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter a number");

            if(!(sc.hasNextInt()))
            {
                System.out.println("Please enter only integer type");
            }

            int number = sc.nextInt();
            int fact=1;
            if(number<=0)
            {
                System.out.println(fact);
            }
            else
            {
                for(int i=1; i<=number; i++)
                {
                    fact= fact*i;
                }
            }
            System.out.println("factorial of "+ number +"is" + fact);
        }
}

