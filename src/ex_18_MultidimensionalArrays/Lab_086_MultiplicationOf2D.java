package ex_18_MultidimensionalArrays;

import java.util.Scanner;

public class Lab_086_MultiplicationOf2D {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size m");
        int m= sc.nextInt();
        System.out.println("Enter the size n");
        int n= sc.nextInt();

        for(int i=0; i < m ; i++ ){
            for (int j = 0; j <n ; j++) {

                System.out.print(i*j + "|");
            }
            System.out.println();
        }
    }
}
