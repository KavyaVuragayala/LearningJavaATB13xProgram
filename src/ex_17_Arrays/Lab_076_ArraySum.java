package ex_17_Arrays;

public class Lab_076_ArraySum {
    public static void main(String[] args) {

        int[] a = {10,2,3,90};
        int sum=0;
        for (int i = 0; i < a.length ; i++) {

            sum = sum + a[i];
        }
        System.out.println(sum);
    }
}
