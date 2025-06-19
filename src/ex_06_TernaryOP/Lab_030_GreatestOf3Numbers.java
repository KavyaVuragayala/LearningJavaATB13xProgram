package ex_06_TernaryOP;

public class Lab_030_GreatestOf3Numbers {
    public static void main(String[] args){

        int a= 9;
        int b= -25;
        int c=-10;
        int result = (a>b && a>c) ? a : (b>c && b>a) ? b : c;
        System.out.println(result);
    }
}
