package ex_08_Increment_Decrement;

public class Lab_037_Example {
    public static void main(String[] args) {

        int a=25; // a++ = 10 ; a=11; --> ++a = 12 ; a=12 ---> 10+12= 22
                 // a++ = 13 , a=14 ; ++a = 15 , a=15 ----> 13+15 = 28
                // a++= 25 , a=26 ; ++a = 27 , a= 27 ---> 25+27 -> 52
        System.out.println(a++ + ++a);// a++ = 5 ; a=6 --> ++a = 7 ; a= 7  --> 6+6 = 12
        System.out.println(a); // 7
    }
}
