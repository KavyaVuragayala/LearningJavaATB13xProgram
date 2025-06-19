package ex_10_Switch;

public class Lab_042_MultipleMatch {
    public static void main(String[] args) {
    // can have multiple stmts in single case , need to include break
        int a = 111;
        switch(a)
        {
            case 111,112,113 :
                System.out.println("hiiii");
                System.out.println("hiiii");
                System.out.println("hiiii");
                break;
            case 114,115 :
                System.out.println("hellooo");
                System.out.println("hellooo");
                System.out.println("hellooo");
                break;
            default:
                System.out.println("error");
        }
    }
}
