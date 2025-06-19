package ex_10_Switch;

import java.util.Scanner;

public class Lab_040_Switch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num=sc.nextInt();
      /*
        String str=sc.next();  if any string type is used
        str = str.toLowerCase();
*/
        switch(num)
        {
            case 1 :
                System.out.println("Mon");
                break;
            case 2 :
                System.out.println("Tue");
                break;
            case 3 :
                System.out.println("Wed");
                break;
            case 4 :
                System.out.println("Thur");
                break;
            case 5 :
                System.out.println("Fri");
                break;
            case 6 :
                System.out.println("Sat");
                break;
            case 7 :
                System.out.println("Sun");
                break;

            default:
                System.out.println("Error");
        }
    }
}
