package ex_18_MultidimensionalArrays;

import java.util.Scanner;

public class Lab_88_Pattern3 {
    public static void main(String[] args) {
        // n=4
        //       *
        //     * *
        //   * * *
        // * * * *


        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size");
        int n= sc.nextInt();

        for(int i=1; i<=n ; i++){

            for(int j= n ; j>=i ; j--){
                System.out.print(" ");
            }

            for(int k=1; k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


















