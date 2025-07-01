package ex_17_Arrays;

public class Lab_071_Array_FixedSize {
    public static void main(String[] args) {
        int[] array = new int[5];
        array[0] = 10;
        array[1] = 20;
        array[2] = 30;
        array[3] = 40;
        array[4] = 50;
        System.out.println(array); // the reference
        System.out.println(array.length);


        String[] s= new String[3];
         s[0]= "Hello";
         s[1]= "World";
         s[2]= "Welcome";
        System.out.println(s[1]);
    }
}
