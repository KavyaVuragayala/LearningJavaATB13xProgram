package ex_17_Arrays;

import java.util.Arrays;

public class Lab_072_ArrayPrint {
    public static void main(String[] args) {

        int[] a = {32,34,78,94,12,56};

        for (int i = 0; i < a.length ; i++) {

            System.out.println(a[i]);
        }

        Arrays.sort(a);
        System.out.println("--------------------------------------");
        for (int i = 0; i < a.length ; i++) {

            System.out.println(a[i]);
        }

    }
}
