package ex_31_WrapperClass;

public class Lab_125_Conversion {
    public static void main(String[] args) {

        int a = 10;
        Integer b = a; // JVM automatically converts PDT --> Wrapper Class
        // PDT --> Wrapper Class is called as AutoBoxing
        System.out.println(b.intValue());
        System.out.println(Integer.MIN_VALUE);


        Integer a1= 45;
        int b1 = a1;      // Unboxing Wrapper Class ---> PDT
        System.out.println(b1);
    }
}
