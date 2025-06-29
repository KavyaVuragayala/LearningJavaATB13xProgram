package ex_12_WhileLoop;
import java.util.Scanner;

public class Factorial_whileLoop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");

        if (!(sc.hasNextInt())) {
            System.out.println("Enter integer value only!!!!!");
            System.exit(0);
        }

        int n = sc.nextInt();

        int fact = 1;

        if( n<=0)
        {
            System.out.println(fact);
        }

       else {
           int i=1;
            while (i <= n) {
                fact = (fact * i);
                i++;

            }

            System.out.println(fact);
        }

    }
}
