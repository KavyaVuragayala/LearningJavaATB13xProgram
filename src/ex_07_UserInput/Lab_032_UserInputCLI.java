package ex_07_UserInput;

public class Lab_032_UserInputCLI {
    public static void main(String[] args) {

        // right side up we have 3 dots -> edit-> enter the value in the 3rd box
        String str = args[0];
        int age = Integer.parseInt(str); // converting string to int
        String vote = (age>=18) ? "Yes" : "No" ;
        System.out.println(vote);
    }
}
