package ex_17_Arrays;



public class Lab_080_ArrayCopy {
    public static void main(String[] args) {

        int[] original = {1,2,3};
        int[] copy = new int[original.length];

        System.arraycopy(original,0,copy,0,original.length);

        /* src: The source array from which elements are copied.

            srcPos: The starting index in the source array.

            dest: The destination array to which elements are copied.

            destPos: The starting index in the destination array.

            length: The number of elements to copy.
        */
    }
}
