package ex_33_Generics;

public class Lab_143_Generics {
    public static void main(String[] args) {

        display(2,3);
        display("alice","jesh");
        display(true,false);
    }

    static <T> void display (T a , T b){

        System.out.println(a);
        System.out.println(b);

    }
}
