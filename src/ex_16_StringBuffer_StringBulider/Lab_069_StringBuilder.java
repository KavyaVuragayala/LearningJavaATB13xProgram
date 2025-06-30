package ex_16_StringBuffer_StringBulider;

public class Lab_069_StringBuilder {
    public static void main(String[] args) {

        // String Builder is also mutable in nature

        StringBuilder sb= new StringBuilder("Alice");
        sb.append("John"); // AliceJohn
        System.out.println(sb);
        System.out.println(sb.reverse()); // nhoJecilA


        String s1= "Hello";
        String s2= "World";
        String s3= s1+ s2;  // Creates a new string "Hello World!"
        System.out.println(s3); // HelloWorld
        System.out.println(s1); // Hello

    }
}
