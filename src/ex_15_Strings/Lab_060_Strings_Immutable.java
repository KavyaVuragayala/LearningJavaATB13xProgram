package ex_15_Strings;

public class Lab_060_Strings_Immutable {
    public static void main(String[] args) {

        String s1= "Alice";
        s1.toUpperCase() ; // will not print ALICE as strings are immutiable , and its not re-assigned
        s1= s1.toUpperCase(); // now it prints ALICE as it is re-assigned // it creates a new string
        System.out.println(s1); // ALICE


    }
}
