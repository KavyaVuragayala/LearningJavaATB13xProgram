package ex_07_UserInput;

public class Lab_033_UserInputCLI2 {
    public static void main(String[] args) {
        System.out.println(args[0]); // without providing any data in config we see ArrayIndexOutOfBoundsException
        System.out.println(args[1]); // add values in edit config then we see values
        System.out.println(args[2]);


    }
}
