package ex_05_Casting;

public class Lab_026_NarrowingCasting {
    public static void main(String[] args) {
        int a=300; // converts into 16 bits binary number i.e 0000000100101100

        byte c = (byte)a;  // so mentioning explicitly to covert int -> byte , but there might be some data loss
        // byte is 8 bits so it takes only 8 bits i.e 00101100 -->44

       System.out.println(c);

     //   Casts a double to an int, cutting off decimals value.
        double d= 539.78;
        int i= (int)d;
        System.out.println(i);

        // int a = 10, int b = 3; now divide 10/3 and store the decimal value in the Result variable and print it.

        int a1=10;
        int b1= 3;
        double final_value = (double)a1/b1;
        System.out.println(final_value);
    }
}



