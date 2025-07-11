package ex_32_Exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab_138_IQ4 {
    public static void main(String[] args) {
        System.out.println("starting");
        try {
            FileReader f = new FileReader("C://abc.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("end");
    }
}

/*
    starting
    C:\abc.txt (The system cannot find the file specified)
    end
 */
