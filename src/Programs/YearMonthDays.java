package Programs;

import java.util.Scanner;

/* Convert Days into Years, Months, and Days.

       :- Take the Days Input from the User

    Define the conversion logic:

        :- Assume 1 year = 365 days.

        :- Assume 1 month = 30 days

        :- Convert the Days into Years, Month and days and Print it.

if you input 1000 days, the output of the program would be:  2 years, 9 months, and 0 days.  */

public class YearMonthDays {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a num");

            if(!(sc.hasNextInt())){
                System.out.println("Enter valid number only !!!");
                System.exit(0);
            }

            int num = sc.nextInt();

            int years = num/365;      // will get quotient
            int remainingdays = num%365;   // remainder
            int months = remainingdays/30;
            int days = remainingdays%30;
        System.out.println(years+"years" +months+"months" +days+"days");
    }
}
