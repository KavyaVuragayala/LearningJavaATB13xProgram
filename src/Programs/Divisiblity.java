package Programs;

import java.util.Scanner;

public class Divisiblity {
    // Check if a Number is Divisible by 5 and 11
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");

        if(!(sc.hasNextInt())){
            System.out.println("Enter valid number only !!!");
            System.exit(0);
        }

        int num = sc.nextInt();

        if(num%5==0 && num%11==0){
            System.out.println("Number is Divisible by 5 and 11");
        }
        else {
            System.out.println("Number is not Divisible by 5 and 11");
        }
    }

}
