package ex_18_MultidimensionalArrays;

import java.util.Scanner;

public class Lab_87_Pattern2 {
    public static void main(String[] args) {

        // n=3 ;
        //  ***
        //  **
        //  *
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size");
        int n= sc.nextInt();
        for(int i =1; i<=n ;i++){
            for(int j=n; j>=i ; j--){
                System.out.print("*");
            }
            System.out.println();
        }

    }

}

