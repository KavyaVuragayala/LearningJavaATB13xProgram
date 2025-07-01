package ex_17_Arrays;

import java.util.Arrays;

public class Lab_077_Array2ndLargestNum {
    public static void main(String[] args) {
        int[] a = {32,102,78,94,89,6};
        Arrays.sort(a);

        System.out.println(a[a.length-2]);
        System.out.println(a[a.length-3]);
    }
}
