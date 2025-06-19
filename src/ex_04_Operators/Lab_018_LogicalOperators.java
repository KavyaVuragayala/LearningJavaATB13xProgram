package ex_04_Operators;

public class Lab_018_LogicalOperators {
    public static void main(String[] args) {
        // ! -> NOT
        // || -> logical OR
        // && -> logical AND

        boolean a = true;
        System.out.println(!a); // returns false

        boolean b = true || false ;
        System.out.println(b); // returns true

        boolean c = true || true ;
        System.out.println(c); // returns true

        boolean d = false || false ;
        System.out.println(d); // returns false

        boolean e = true && false ;
        System.out.println(e); // returns false

        boolean f = false && false ;
        System.out.println(f); // returns false

        boolean g = true && true ;
        System.out.println(g); // returns true

    }
}
