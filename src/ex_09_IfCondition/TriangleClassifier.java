package ex_09_IfCondition;
import java.util.Scanner;
public class TriangleClassifier {
    public static void main(String[] args){

        /* Triangle Classifier:Write a program that classifies a triangle based on its side lengths. Given three input values representing the lengths of the sides,
         determine if the triangle is equilateral (all sides are equal), isosceles (exactly two sides are equal), or scalene (no sides are equal).
         Use an if-else statement to classify the triangle*/

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter side 1 ");
        int a = sc.nextInt();

        System.out.println("Enter side 2 ");
        int b = sc.nextInt();

        System.out.println("Enter side 3 ");
        int c = sc.nextInt();

        // to check whether its is a triangle or not
        if (a + b > c && a + c > b && b + c > a)
        {
            if (a == b && b == c)
            {
                System.out.println("Equilateral triangle");
            } else if (a == b || b == c || a == c)
            {
                System.out.println("Isosceles triangle");
            } else
            {
                System.out.println("Scalene triangle");
            }
        } else {
            System.out.println("The given sides do not form a valid triangle.");
        }


    }
}
