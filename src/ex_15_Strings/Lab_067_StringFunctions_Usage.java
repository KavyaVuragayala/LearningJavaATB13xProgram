package ex_15_Strings;

public class Lab_067_StringFunctions_Usage {
    public static void main(String[] args){
        String s= "Sonal";
        System.out.println(s.length());
        System.out.println(s.charAt(0));
        System.out.println(s.charAt(1));
        System.out.println(s.charAt(2));
        System.out.println(s.charAt(3));
        System.out.println(s.charAt(4));
       // System.out.println(s.charAt(10)); // StringIndexOutOfBoundsException

        System.out.println(s.concat(" Patel"));

        System.out.println(s.equals("Sonal"));
        System.out.println(s.equalsIgnoreCase("sonal"));

        System.out.println(s.indexOf('o'));

        String s1 = "madam";
        System.out.println(s1.indexOf('m')); // first occurence
        System.out.println(s1.lastIndexOf('m'));

        System.out.println(s.length());
        System.out.println(s.replace('n','N'));

        String s2 = "abc@hotmail@gmail.com";
        //System.out.println(s2.split("@")); //[Ljava.lang.String;@27716f4
        String[] s2_splited = s2.split("@");
        System.out.println(s2_splited[0]);
        System.out.println(s2_splited[1]);
        System.out.println(s2_splited[2]);

        System.out.println(s.substring(1,3));
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());

        System.out.println(s.startsWith("S"));
        System.out.println(s.endsWith("n"));

        String s3= "111";
        String s4= "222";
        String s5= s3+s4;
        System.out.println(s5);


        String n = "PRamoddUTTA";
        System.out.println(n.indexOf("d"));
        System.out.println(n.lastIndexOf("d"));
        System.out.println(n.lastIndexOf("s"));




    }
}
