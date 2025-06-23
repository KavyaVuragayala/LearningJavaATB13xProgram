package Programs;
import java.util.Scanner;

public class Vowel_count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s= sc.nextLine();
        //  System.out.println(s.length());
        int vowel=0;
        int consonant=0;

        for( int i=0; i<s.length();i++)
        {
            char ch=Character.toLowerCase((s.charAt(i)));

            if (ch == ' ') {
                continue;
            }
            if( ch=='a' || ch=='e' || ch=='i' || ch=='o'|| ch=='u')
            {
                if(ch==' ')
                {
                    continue;
                }
                // vowel=vowel+1;
                vowel++;
            }
            else
            {
                consonant=consonant+1;
            }
        }

        System.out.println(vowel);
        System.out.println(consonant);
    }
}
