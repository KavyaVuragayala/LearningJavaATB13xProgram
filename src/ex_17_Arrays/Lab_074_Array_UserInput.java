package ex_17_Arrays;

import java.util.Scanner;

public class Lab_074_Array_UserInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();

        System.out.println("Enter the elements into the array");
        int[] array = new int[size];

        // String[] name = new String[size];
        // float[] f = new float[size];

        for(int i=0; i< array.length; i++){
            array[i] = sc.nextInt();    // entering the elements into the array
        }

        for(int i=0; i< array.length; i++) {
            System.out.println(array[i]);   // printing the array
        }

    }
}
