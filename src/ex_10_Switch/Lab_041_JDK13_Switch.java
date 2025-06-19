package ex_10_Switch;

public class Lab_041_JDK13_Switch {
    public static void main(String[] args) {
        //JDK > 13 , switch allows -> function without break function
       // single line
        int a= 001;
        switch(a)
        {
            case 001 -> System.out.println("001");
            case 002 -> System.out.println("002");
            case 003 -> System.out.println("003");
            case 004 -> System.out.println("004");
            default -> System.out.println("default");
        }
    }
}
