package ex_12_WhileLoop;

import java.util.Random;
import java.util.Scanner;

public class Guessing_game {
    public static void main(String[] args) {
        // Guessing game
        //randomly picking a number

        Random random = new Random(); // in bulit in java
        int random_number = random.nextInt(100)+1;// 100 means it takes only from 0 to 99 +1 is added to check for 0 to 100
        System.out.println(random_number);  // generates a random number

        Scanner sc= new Scanner(System.in);
        System.out.println("Guess the number");
        int guess_number;
        int attempts =0;

        while(true) {
            guess_number = sc.nextInt();
            attempts++;


            if (guess_number < random_number) {
                System.out.println("too low!");
            } else if (guess_number > random_number) {
                System.out.println("too high!!");
            } else {
                System.out.println("Correct attempted in " + attempts);
                break;
            }
        }

        }


    }

