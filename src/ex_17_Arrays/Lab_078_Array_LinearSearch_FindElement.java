package ex_17_Arrays;

public class Lab_078_Array_LinearSearch_FindElement {
    public static void main(String[] args) {

        // find an element and its index
        int[] a = {32,102,78,94,89,6};
        int target = 78;

        for(int i=0 ; i < a.length ;i++){
            if(target == a[i]){
                System.out.println("Found target element " + a[i] + " at index " + i);
                break;

            }

        }

    }
}
