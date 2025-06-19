package ex_06_TernaryOP;

public class Lab_028_TernaryOp {
    public static void main(String[] args) {
        // expression ? value 1 : value 2

        int age =10;
        String age_to_vote= age>18 ? "Yes" : "No" ;
        System.out.println(age_to_vote);

        int a=1;
        int b=2;
        int result = a>b ? a :b;
        System.out.println(result);
        System.out.println(Math.max(a,b));  // without ternary op using math function

        int number=7;
        String even_odd = (number%2==0) ? "Even" : "odd" ;
        System.out.println(even_odd);


    }
}
