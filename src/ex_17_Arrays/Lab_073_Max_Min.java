package ex_17_Arrays;

public class Lab_073_Max_Min {
    public static void main(String[] args) {

        int[] a = {32,102,78,94,89,6};
        int max_number = max(a);
        int min_number = min(a);
        System.out.println(max_number);
        System.out.println(min_number);

    }
    static int max(int[] input){

        int max=input[0];
        for (int i = 0; i < input.length ; i++) {
            if(input[i] > max){
                max=input[i];
            }

        }
        return max;

    }

    static int min(int[] input){
        int min=input[0];
        for (int i = 0; i < input.length ; i++) {
            if(input[i] < min){
                min=input[i];
            }

        }
        return min;

    }
}
