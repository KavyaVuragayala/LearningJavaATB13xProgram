package ex_22_Polymorphism.MethodOverLoading;

public class Lab_107_UseinWebAuto {
    public static void main(String[] args) {

        Browser b1= new Browser();
        b1.startBrowser();    // Default Browser
        b1.startBrowser("Chrome");   // Starting Chrome
    }
}

class Browser{

    void startBrowser(){
        System.out.println("Default Browser");
    }
    String startBrowser(String browser){
        System.out.println("Starting "+ browser);
        return browser;
    }
}
