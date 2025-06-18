package ex_02_Java_Basics;

public class Lab_008_Diff_PrintingStmt {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("Prints in different line");
        System.out.print("Prints in same line");
        System.out.println("**************************");
        System.out.printf("Value of a is %d",a); //printf is used to format
        //%d -> int,byte,long,short
        //%s -> String
        //%f -> float
        //%b -> boolean

    }
}
