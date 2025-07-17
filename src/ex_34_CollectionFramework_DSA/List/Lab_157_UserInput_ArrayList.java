package ex_34_CollectionFramework_DSA.List;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab_157_UserInput_ArrayList {
    public static void main(String[] args) {

        ArrayList<String> name = new ArrayList();
        ArrayList<Integer> age = new ArrayList();

        Scanner sc= new Scanner(System.in);
        String continueInput= "Yes";

        while(continueInput.equalsIgnoreCase("Yes")){

            System.out.println("Enter name");
            String userName= sc.next();
            name.add(userName);

            System.out.println("Enter age");
            Integer userAge = sc.nextInt();
            age.add(userAge);

            sc.nextLine();
            System.out.println("Do you want to enter anothe input give Yes or No");
            continueInput= sc.nextLine();
        }

        for(Object o1 : name){
            System.out.println(o1);
        }
        for(Object o2 : age){
            System.out.println(o2);
        }


    }
}
