package ex_22_Polymorphism.MethodOverRiding;

public class Lab_108_Moverriding_webAuto {
    public static void main(String[] args) {

        Chrome c= new Chrome();
        c.openBrowser();

        Firefox f= new Firefox();
        f.openBrowser();

        CommonToAll CTA =new Chrome();    // Dynamic Dispatch
        CTA.openBrowser();

        CommonToAll CTA1= new CommonToAll();
        CTA1.openBrowser();
    }
}

class CommonToAll{
    void openBrowser(){
        System.out.println("Open Default Browser");
    }
}

class Chrome extends CommonToAll{
    void openBrowser(){
        System.out.println("Open Chrome Browser");
    }
}

class Firefox extends CommonToAll{
    void openBrowser(){
        System.out.println("Open Firefox Browser");
    }
}


