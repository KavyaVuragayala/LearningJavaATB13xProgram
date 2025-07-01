package ex_18_MultidimensionalArrays;

import java.util.Scanner;

public class Lab_84_RightTriangle {
    public static void main(String[] args) {

        // n=3 ;
        //*
        //* *
        //* * *
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size");
        int n= sc.nextInt();
        for(int i=1; i <= n ; i++ ){
            for (int j = 1; j <= i ; j++) {

                System.out.print("*");
            }
            System.out.println();
        }
    }
}
