package ex_15_Strings;

public class Lab_065_Strings_IQ2 {
    public static void main(String[] args) {
        String s1= "Hello";
        String s2="Hello";
        // how any strings are there in string constant pool -----> 1   ---> immutable

        String s3= new String("Hello"); //1
        String s4= new String("Hello"); //2
        String s5= new String("Hello");//3
        // when new keyword then we have total 3 in Object area

        // in total we have 4 strings

    }
}
