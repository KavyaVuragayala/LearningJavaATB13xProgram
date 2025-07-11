package ex_32_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab_139_Throws {
    public static void main(String[] args) {

    }

    static void t() throws FileNotFoundException {
        FileInputStream f = new FileInputStream("C://abc.txt");
    }
}
