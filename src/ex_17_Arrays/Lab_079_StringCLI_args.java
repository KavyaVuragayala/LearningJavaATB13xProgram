package ex_17_Arrays;

public class Lab_079_StringCLI_args {
    public static void main(String[] alice) {

        // String[] args is also a array which stores elements
        // go to edit -> passing elements through CLI and prints them through args

        for (int i = 0; i < alice.length ; i++) {
            System.out.println(alice[i]);  // passed 10 45 73 28 through CLI
            // args can be place with any other strings as well

        }

        System.out.println("-----------------------");
        // using for each loop

        for (String string : alice){    // for(datatype variable_name : item ) {  }

            System.out.println(string);
        }

    }
}
