package ex_16_StringBuffer_StringBulider;

import static java.nio.file.Files.delete;

public class Lab_068_StringBuffer {
    public static void main(String[] args) {

        // String Buffer are mutable in nature

        StringBuffer string_buffer = new StringBuffer("Hello"); // same declaration as string using new
        string_buffer.append("World");
        System.out.println(string_buffer); // HelloWorld
        System.out.println(string_buffer.reverse());// dlroWolleH
        System.out.println(string_buffer.replace(0,3,"w")); // woWolleH
        System.out.println(string_buffer.delete(1,2)); // wWolleH

    }
}
