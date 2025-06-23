package ex_13_doWhile;

public class Lab_051_diff_while_dowhile {
    public static void main(String[] args) {

        int a = 0;
        while (a < 0) {
            System.out.println(a);             //this code doesn't prints anything
            a++;
        }

        int b=0;
        do{
            System.out.println("execute once");         // one time b will be printed
            System.out.println(b);
            b++;
        }while(b<0);

    }
}
