package ex_014_Functions;
import java.util.Scanner;

public class Lab_059_ArthimeticExpressions_Functions {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter x");
        int a=0;
        if(sc.hasNextInt()) {
            a = sc.nextInt();
        }
        else {
            System.out.println("enter integer value only !!!");
            return;
        }

        System.out.println("Enter y");
        int b=0;
        if(sc.hasNextInt()) {
            b = sc.nextInt();
        }
        else {
            System.out.println("enter integer value only !!!");
            System.exit(0);
        }

        int result = sum(a,b);
        int result1 = sub(a,b);
        int result2 = mul(a,b);
        int result3 = div(a,b);
        int result4 = mod(a,b);

        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }


    static int sum(int x, int y)
    {
        return x+y;
    }
    static int sub(int x, int y)
    {
        return x-y;
    }
    static int mul(int x, int y)
    {
        return x*y;
    }
    static int div(int x, int y)
    {
        if(y==0){
         //   System.out.println("cannot be zero");
           // System.exit(0);
            throw new ArithmeticException("cant be zero");
        }
            return x / y;

    }
    static int mod(int x, int y)
    {
        return x%y;
    }
}
