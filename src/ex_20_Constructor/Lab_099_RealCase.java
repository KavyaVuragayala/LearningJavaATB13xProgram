package ex_20_Constructor;

public class Lab_099_RealCase {
    public static void main(String[] args) {

        WebAutomation w= new WebAutomation();
        // the moment WebAutomation() is created it automatically class the const without sending with reference of w
    }

}

class WebAutomation{

    // Default Const
    WebAutomation(){
        System.out.println("I want to read a CSV file");
    }
}
