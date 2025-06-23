package ex_13_doWhile;

public class Lab_052_RealCase_dowhile {
    public static void main(String[] args) {

    // incase of web automation we may require to call the function or print a value atleast once
        int b=0;
        do{
            System.out.println("execute once");         // one time b will be printed
            System.out.println(b);
            b++;
        }while(b<0);
    }
}
