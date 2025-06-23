package ex_15_Strings;

public class Lab064_Strings_IQ {
    public static void main(String[] args) {
        // total number of strings

        String s= "Alice";  // 1
        s=s.toUpperCase();   //re-assigned so total 2 strings , if not re-assigned then total number of strings are 1
        System.out.println(s);
    //    System.out.println(s.size()); // strings dont have size
        System.out.println(s.length());
    }
}
