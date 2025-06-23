package ex_15_Strings;

public class Lab_066_Strings_IQ3 {
    public static void main(String[] args) {
        // String Constant Pool
        String s1= "Hello";
        String s2="Hello";
        // how any strings are there in string constant pool -----> 1   ---> immutable

        // Object Area
        String s3= new String("Hello"); //1
        String s4= new String("Hello"); //2
        String s5= new String("hello");//3
        // when new keyword then we have total 3 in Object area

        // in total, we have 4 strings

        // == will check for loaction preferences
        System.out.println(s1==s3); // diff loations so false
        System.out.println(s1==s4); //false
        System.out.println(s3==s4);//false
        System.out.println(s1==s5);// false
        System.out.println(s1==s2); // same location so true
        System.out.println(s4==s5);

        // equals() --> will check the content
        System.out.println(s1.equals(s2));  // equals checks the content
        System.out.println(s4.equals(s5));  // false due to case senstivity
        System.out.println(s4.equalsIgnoreCase(s5)); // true
    }
}
