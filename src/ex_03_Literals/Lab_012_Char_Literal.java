package ex_03_Literals;

public class Lab_012_Char_Literal {
    public static void main(String[] args) {

        //ASCII values
        //char uppercase = 'A'; A-> 65 to Z->90
        //char lowercase = 'a';  a-> 97 to z->172
        char a = '@';
        char b= '#';
        char c= '%';

        char new_line = '\n';
        char tab_line = '\t';
        char back_space ='\b';
        char carraige_return = '\r';

        System.out.println("Kavya"+new_line+"Sree"); // prints in new line
        System.out.println("Kavya\nSree");
        System.out.println("Kavya"+tab_line+"Sree");// prints in giving a tab space in between
        System.out.println("Kavya\tSree");
        System.out.println("Kavya"+back_space+"Sree");// prints in deleting a letter from previous word
        System.out.println("Kavya\bSree");
        System.out.println("Kavya"+carraige_return+"Sree");//deletes the previous wrord
        System.out.println("Kavya\rSree");

    }
}
