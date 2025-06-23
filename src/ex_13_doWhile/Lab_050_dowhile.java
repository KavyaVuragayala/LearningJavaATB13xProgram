package ex_13_doWhile;

public class Lab_050_dowhile {
    public static void main(String[] args) {

     //   do while -> initization , condition , body(executes atleast once) , updation(inc/dec)

        int a=1;
        do{
            System.out.println("this executes atleast once");
            System.out.println(a);
            a++;
        }while(a<5);
    }
}
