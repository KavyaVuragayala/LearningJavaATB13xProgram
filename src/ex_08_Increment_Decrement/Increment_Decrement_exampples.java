package ex_08_Increment_Decrement;

public class Increment_Decrement_exampples {
    public static void main(String[] args) {

        int a1 = 5;

        int b1 = a1++; // a++ = 5 , a=6 , b=5

        System.out.println("a: " + a1 + ", b: " + b1);



//🔹 Program 2:
        int i = 1;

        i = i++ + ++i;  //i++ = 1 , i=1 ; ++i =2 , i=2

        System.out.println(i); // ?  2+2 = 4


//🔹 Program 3:

        int x1 = 5; // x++ = 5 , x=6 ; ++x= 7 , x=7

        System.out.println(x1++ + ++x1); // ? //5+7 = 12





//🔹 Program 4:

        int x2 = 5;

        System.out.println(++x2); // Output: ? ++x = 6 ; x=6

        System.out.println(x2++); // Output: ? x++ =6 , x=7

        System.out.println(x2);   // Output: ? x=7

//🔹 Program 5:  Interview Question

        int a = 5;

        int b = a++ + ++a; // a++ = 5 , a=6 ; ++a = 7 , a=7 ----> b=5+7 = 12

        System.out.println("a: " + a); // Output: ? 7

        System.out.println("b: " + b); // Output: ?12



//🔹Program 6:  Interview Question

        int x = 5;

        int y = x++ + ++x + x++ + ++x; // x++ = 5 , x=6 ; ++x = 7 , x=7 ; x++ = 7 , x=8 ; ++x = 9 ,x= 9 --> 5+7+7+9= 28

        System.out.println("x = " + x + ", y = " + y); // x- 9 ; y= 28
    }
}
